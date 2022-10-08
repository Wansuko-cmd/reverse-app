class FormulaQueryServiceImpl : FormulaQueryService {
    override suspend fun getCoordinate(
        board: FormulaBoard,
        piece: Cell.Piece,
    ): FormulaBoard.FormulaCoordinate? = null
}
