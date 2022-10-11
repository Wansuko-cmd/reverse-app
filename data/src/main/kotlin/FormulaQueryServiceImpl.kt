class FormulaQueryServiceImpl : FormulaQueryService {
    override suspend fun getCoordinate(
        board: FormulaBoard,
        piece: Cell.Piece,
    ): FormulaBoard.FormulaCoordinate? = data[board].also { println(it) }
}

val data = mapOf(
    FormulaBoard(
        listOf(
            nothing(8),
            nothing(8),
            nothing(8),
            nothing(3) + white(1) + black(1) + nothing(3),
            nothing(3) + black(1) + white(1) + nothing(3),
            nothing(8),
            nothing(8),
            nothing(8),
        )
    ) to FormulaBoard.FormulaCoordinate(4, 5)
)
