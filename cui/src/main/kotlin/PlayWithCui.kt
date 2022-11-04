import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

private val deviseNextMoveUseCase = DeviseNextMoveUseCase(
    formulaAlgorithm = FormulaAlgorithm(FormulaQueryServiceImpl()),
    leavePlaceableCoordinateAlgorithm = LeavePlaceableCoordinateAlgorithm(),
    checkAllPattenAlgorithm = CheckAllPattenAlgorithm(),
)

fun main() = runBlocking {
    var board = Board.create(8)
    while (
        board.countNothing() > 0 &&
        (board.placeableCoordinates(Cell.Piece.Black) + board.placeableCoordinates(Cell.Piece.White)).isNotEmpty()
    ) {
        board = placeByPlayer(board, Cell.Piece.Black)
        board = placeByCPU(board, Cell.Piece.White)
    }
    println(board.toDisplayString())
    println(board.count())
    println("end")
}

fun placeByPlayer(board: Board, piece: Cell.Piece): Board {
    if (board.placeableCoordinates(piece).isEmpty()) return board
    println(board.toDisplayString())
    println(board.placeableCoordinates(piece))
    val coordinate = readCoordinate(board, piece)
    return board.place(coordinate, piece)
}

suspend fun placeByCPU(board: Board, piece: Cell.Piece): Board {
    if (board.placeableCoordinates(piece).isEmpty()) return board
    println(board.toDisplayString())
    val (time, coordinate) = measure { deviseNextMoveUseCase(board, piece)!! }
    println(coordinate)
    println("$time ms")
    return board.place(coordinate, piece)
}

suspend fun placeRandom(board: Board, piece: Cell.Piece): Board {
    if (board.placeableCoordinates(piece).isEmpty()) return board
    println(board.toDisplayString())
    val (time, coordinate) = measure { board.placeableCoordinates(piece).random() }
    println(coordinate)
    println("$time ms")
    return board.place(coordinate, piece)
}

fun readCoordinate(board: Board, piece: Cell.Piece): Board.Coordinate {
    while (true) {
        val input = readLine()
            ?.replace(" ", "")
            ?.split(',')
            ?.map { it.toIntOrNull() }
        println(input)
        if (
            input?.count() == 2 &&
            input.all { it != null } &&
            0 <= input[0]!! && input[0]!! < board.height &&
            0 <= input[1]!! && input[1]!! < board.width
        ) {
            val coordinate = board.Coordinate(row = input[0]!!, column = input[1]!!)
            if (board.placeableCoordinates(piece).contains(coordinate)) return coordinate
        }
        println("無効な入力")
    }
}

fun Board.toDisplayString(): String = this.toString()
    .replace("Cell\$Nothing", " ")
    .replace("Cell\$Piece\$Black", "○")
    .replace("Cell\$Piece\$White", "●")

inline fun <T> measure(block: () -> T): Pair<Long, T> {
    var value: T?
    return measureTimeMillis { value = block() } to value!!
}
