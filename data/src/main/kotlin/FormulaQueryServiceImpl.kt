import data.formulaData

class FormulaQueryServiceImpl : FormulaQueryService {
    override suspend fun getCoordinate(
        board: FormulaBoard,
        piece: Cell.Piece,
    ): FormulaBoard.FormulaCoordinate? = formulaData
        .firstOrNull { it.board == board && it.piece == piece }
        ?.coordinate
}
