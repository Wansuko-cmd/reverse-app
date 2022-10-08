import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class LeavePlaceableCoordinateAlgorithm {
    suspend operator fun invoke(board: Board, piece: Cell.Piece): Board.Coordinate? {
        val coordinate = board.placeableCoordinateWithoutAroundCorner(piece)
        if (coordinate.isEmpty()) return null

        // 相手が最善手を打った時の（相手目線の）評価値のなかで最も低くなるものを採用する
        return coordinate.minBy {
            searchMaxPlaceableCoordinate(board.place(it, piece), REPEAT_AMOUNT, piece.reverse())
        }
    }

    private suspend fun searchMaxPlaceableCoordinate(board: Board, repeat: Int, piece: Cell.Piece): Int =
        coroutineScope {
            val coordinate = board.placeableCoordinates(piece)
            if (repeat <= 0 || coordinate.isEmpty()) {
                // 評価値を返す
                return@coroutineScope evaluate(board, piece, coordinate.count())
            }
            coordinate
                // 相手が最善手を打った時の（相手目線の）評価値が低いほど自分の評価値が高いと考える
                // そのため、相手の評価値に - をかけたものを自分の評価値とする
                .map { async { -searchMaxPlaceableCoordinate(board.place(it, piece), repeat - 1, piece.reverse()) } }
                // 自分の評価値が最大となる一手を選ぶ
                .maxOf { it.await() }
        }

    private fun Board.placeableCoordinateWithoutAroundCorner(piece: Cell.Piece): List<Board.Coordinate> {
        val coordinate = this.placeableCoordinates(piece)
        val coordinateWithoutCorner = coordinate - this.aroundCorner.toSet()
        return coordinateWithoutCorner.ifEmpty { coordinate }
    }

    private fun evaluate(board: Board, piece: Cell.Piece, placeableCoordinate: Int) =
        MY_WEIGHT * placeableCoordinate -
            OPPONENT_WEIGHT * board.placeableCoordinates(piece.reverse()).count() +
            -board.count()[piece]

    companion object {
        const val REPEAT_AMOUNT = 5

        const val MY_WEIGHT = 1
        const val OPPONENT_WEIGHT = 1
    }
}
