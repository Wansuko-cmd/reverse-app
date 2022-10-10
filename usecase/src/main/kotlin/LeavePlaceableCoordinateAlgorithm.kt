import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class LeavePlaceableCoordinateAlgorithm {
    suspend operator fun invoke(board: Board, piece: Cell.Piece): Board.Coordinate? {
        val coordinates = board.placeableCoordinateWithoutAroundCorner(piece)
        if (coordinates.isEmpty()) return null

        return coordinates.maxBy { coordinate ->
            (0..REPEAT_AMOUNT).sumOf { readNextMove(board, coordinate, piece, it) }
        }
    }

    private suspend fun readNextMove(
        board: Board,
        coordinate: Board.Coordinate,
        piece: Cell.Piece,
        count: Int,
    ): Int = coroutineScope {
        if (count <= 0) return@coroutineScope evaluate(board, piece, coordinate)

        val placedBoard = board.place(coordinate, piece)
        val reversedPiece = piece.reverse()
        val placeableCoordinate = placedBoard.placeableCoordinates(reversedPiece)

        if (placeableCoordinate.isEmpty()) return@coroutineScope evaluate(board, piece, coordinate)

        placeableCoordinate
            // 相手側が一手進めた時の評価値を取得
            .map { async { readNextMove(placedBoard, it, reversedPiece, count - 1) } }
            // 相手側の評価値が最も高い場合を採用する
            .maxOf { it.await() }
            .let { -it }
    }

    private fun Board.placeableCoordinateWithoutAroundCorner(piece: Cell.Piece): List<Board.Coordinate> {
        val coordinate = this.placeableCoordinates(piece)
        val coordinateWithoutCorner = coordinate - this.aroundCorner.toSet()
        return coordinateWithoutCorner.ifEmpty { coordinate }
    }

    private fun evaluate(board: Board, piece: Cell.Piece, coordinate: Board.Coordinate) =
        -board.openness(coordinate, piece)!!

    companion object {
        const val REPEAT_AMOUNT = 0
    }
}
