import api.AisIndexPostRequest
import api.PlayerSerializable
import api.RoomSerializable
import api.RoomShowPostRequest
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.SerialName

private val client = HttpClient(CIO) {
    install(ContentNegotiation) {
        json()
    }
}

private val deviseNextMoveUseCase = DeviseNextMoveUseCase(
    formulaAlgorithm = FormulaAlgorithm(FormulaQueryServiceImpl()),
    leavePlaceableCoordinateAlgorithm = LeavePlaceableCoordinateAlgorithm(),
    checkAllPattenAlgorithm = CheckAllPattenAlgorithm(),
)

fun main() = runBlocking {
    val id = client
        .post("http://localhost:8000/ai") {
            contentType(ContentType.Application.Json)
            setBody(AisIndexPostRequest(userName = "Hoge"))
        }
        .body<PlayerSerializable>()
        .id

    while (true) {
        delay(1000L)

        val roomId = client
            .get("http://localhost:8000/ai/$id")
            .body<PlayerSerializable>()
            .status ?: continue

        val room = client
            .get("http://localhost:8000/rooms/$roomId")
            .body<RoomSerializable>()

        if (room.next?.id != id) continue

        val board = room.board.map { row ->
            row.map { column -> Cell.from(column) }
                .let { Column.reconstruct(it) }
        }.let { Board.reconstruct(it) }

        val piece = if (room.black.id == id) Cell.Piece.Black else Cell.Piece.White

        val next = deviseNextMoveUseCase(
            board = board,
            piece = piece,
            useFormula = false,
        ) ?: continue

        val request = RoomShowPostRequest(
            userId = id,
            isUser = false,
            row = next.row,
            column = next.column,
        )

        client.post("http://localhost:8000/rooms/$roomId") {
            contentType(ContentType.Application.Json)
            setBody(request)
        }
    }
}
