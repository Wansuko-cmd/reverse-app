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
        val withoutCoordinate = if (this.countNothing() <= 40) this.diagonalCorner else this.aroundCorner
        val coordinateWithoutCorner = coordinate - withoutCoordinate.toSet()
        return coordinateWithoutCorner.ifEmpty { coordinate }
    }

    private fun evaluate(board: Board, piece: Cell.Piece, coordinate: Board.Coordinate) =
        -board.openness(coordinate, piece)!! + 3 * numOfAround(board, piece)

    private fun numOfAround(board: Board, piece: Cell.Piece) =
        board.corner.map { board[it] }.sumOf {
            when (it) {
                piece -> 1
                else -> -1
            } as Int
        }

    companion object {
        const val REPEAT_AMOUNT = 4
    }
}
