import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class CheckAllPattenAlgorithm {
    suspend operator fun invoke(board: Board, piece: Cell.Piece): Board.Coordinate? {
        val coordinates = board.placeableCoordinates(piece)
        if (coordinates.isEmpty()) return null
        return coordinates
            // 相手が最大限取れるように進めた場合の駒の数で、最も自分の駒が多い場合を取得
            .maxBy { searchMaxPieceCount(board.place(it, piece), piece.reverse())[piece] }
    }

    /**
     * pieceで指定した駒から順に最善手を置いていった場合の駒の数を取得
     */
    private suspend fun searchMaxPieceCount(board: Board, piece: Cell.Piece): PieceCount =
        coroutineScope {
            val coordinates = board.placeableCoordinates(piece)

            // 自分の置ける場所がない場合
            if (coordinates.isEmpty()) {
                // 相手の置ける場所がない場合
                if (board.placeableCoordinates(piece.reverse()).isEmpty()) {
                    return@coroutineScope board.count()
                }
                return@coroutineScope searchMaxPieceCount(board, piece.reverse())
            }

            coordinates
                .map {
                    async { searchMaxPieceCount(board.place(it, piece), piece.reverse()) }
                }
                // 相手が最大限取れるように進めた場合の駒の数を取得
                .map { it.await() }
                // 最も自分の駒が多い場合を選択
                .maxBy { it[piece] }
        }
}
