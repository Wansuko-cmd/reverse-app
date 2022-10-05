class CheckAllPattenAlgorithm {
    operator fun invoke(board: Board, piece: Cell.Piece): Board.Coordinate? {
        val coordinates = board.placeableCoordinates(piece)
        if (coordinates.isEmpty()) return null
        return coordinates
            // 相手が最大限取れるように進めた場合の駒の数で、最も自分の駒が多い場合を取得
            .maxBy { searchMaxPieceCount(board.place(it, piece), piece.reverse())[piece] }
    }

    /**
     * pieceで指定した駒から順に最善手を置いていった場合の駒の数を取得
     */
    private fun searchMaxPieceCount(board: Board, piece: Cell.Piece): PieceCount {
        val coordinates = board.placeableCoordinates(piece)

        // 自分の置ける場所がない場合
        if (coordinates.isEmpty()) {
            // 相手の置ける場所がない場合
            if (board.placeableCoordinates(piece.reverse()).isEmpty()) {
                return board.count()
            }
            return searchMaxPieceCount(board, piece.reverse())
        }

        return coordinates
            .map { board.place(it, piece) }
            // 相手が最大限取れるように進めた場合の駒の数を取得
            .map { searchMaxPieceCount(it, piece.reverse()) }
            // 最も自分の駒が多い場合を選択
            .maxBy { it[piece] }
    }
}
