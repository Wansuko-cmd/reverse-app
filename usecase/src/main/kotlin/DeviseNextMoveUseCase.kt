class DeviseNextMoveUseCase(
    private val checkAllPattenAlgorithm: CheckAllPattenAlgorithm
) {
    /**
     *  次に置くべき駒の場所を返す
     *  置ける場所がない場合はnullを返す
     */
    operator fun invoke(board: Board, piece: Cell.Piece): Board.Coordinate? =
        checkAllPattenAlgorithm(board, piece)
}
