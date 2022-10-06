class FormulaAlgorithm(
    private val formulaQueryService: FormulaQueryService,
) {
    suspend operator fun invoke(board: Board, piece: Cell.Piece) =
        formulaQueryService.getCoordinate(board, piece)
}

interface FormulaQueryService {
    suspend fun getCoordinate(board: Board, piece: Cell.Piece): Board.Coordinate?
}
