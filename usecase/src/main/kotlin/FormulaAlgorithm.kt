class FormulaAlgorithm(
    private val formulaQueryService: FormulaQueryService,
) {
    suspend operator fun invoke(board: Board, piece: Cell.Piece): Board.Coordinate? {
        val a = formulaQueryService
            .getCoordinate(FormulaBoard.from(board), piece)?.toCoordinate(board)
        if (a != null) return a
        val b = formulaQueryService
            .getCoordinate(FormulaBoard.from(board).rotate(), piece)?.rotate()?.rotate()?.rotate()?.toCoordinate(board)
        if (b != null) return b
        val c = formulaQueryService
            .getCoordinate(FormulaBoard.from(board).rotate().rotate(), piece)?.rotate()?.rotate()?.toCoordinate(board)
        if (c != null) return c
        val d = formulaQueryService
            .getCoordinate(FormulaBoard.from(board).rotate().rotate().rotate(), piece)?.rotate()?.toCoordinate(board)
        if (d != null) return d
        val e = formulaQueryService
            .getCoordinate(FormulaBoard.from(board).reverse(), piece)?.reverse()?.toCoordinate(board)
        if (e != null) return e
        val f = formulaQueryService
            .getCoordinate(FormulaBoard.from(board).reverse().rotate(), piece)?.reverse()?.rotate()?.rotate()?.rotate()?.toCoordinate(board)
        if (f != null) return f
        val g = formulaQueryService
            .getCoordinate(FormulaBoard.from(board).reverse().rotate().rotate(), piece)?.reverse()?.rotate()?.rotate()?.toCoordinate(board)
        if (g != null) return g
        return formulaQueryService
            .getCoordinate(FormulaBoard.from(board).reverse().rotate().rotate().rotate(), piece)?.reverse()?.rotate()?.toCoordinate(board)
    }
}

interface FormulaQueryService {
    suspend fun getCoordinate(board: FormulaBoard, piece: Cell.Piece): FormulaBoard.FormulaCoordinate?
}

data class FormulaBoard(private val columns: List<List<Cell>>) {

    init {
        assert(columns.size == 8)
    }

    class FormulaCoordinate(
        private val row: Int,
        private val column: Int,
    ) {
        fun toCoordinate(board: Board) = when {
            board.width < 8 -> toCoordinateForSmallSizeBoard(board)
            board.width == 8 -> board.Coordinate(row, column)
            else -> toCoordinateForBigSizeBoard(board)
        }

        fun rotate() = FormulaCoordinate(7 - column, row)

        fun reverse() = FormulaCoordinate(column, row)

        private fun toCoordinateForSmallSizeBoard(board: Board): Board.Coordinate {
            val width = (8 - board.width) / 2 + board.width % 2
            val height = (8 - board.height) / 2 + board.height % 2
            return board.Coordinate(row - width, column - height)
        }

        private fun toCoordinateForBigSizeBoard(board: Board): Board.Coordinate {
            val width = (board.width - 8) / 2 + board.width % 2
            val height = (board.height - 8) / 2 + board.height % 2
            return board.Coordinate(row + width, column + height)
        }
    }

    fun toDisplayString(): String = this.columns
        .joinToString(separator = "\n") { "[$it]" }
        .let { "Board(\n$it\n)" }
        .replace("Cell\$Nothing", " ")
        .replace("Cell\$Piece\$Black", "○")
        .replace("Cell\$Piece\$White", "●")

    fun rotate(): FormulaBoard {
        val list = columns.map { it.toMutableList() }.toMutableList()
        columns.mapIndexed { row, cells ->
            cells.mapIndexed { column, cell ->
                list[7 - column][row] = cell
            }
        }
        return FormulaBoard(list)
    }

    fun reverse(): FormulaBoard {
        val list = columns.map { it.toMutableList() }.toMutableList()
        columns.mapIndexed { row, cells ->
            cells.mapIndexed { column, cell ->
                list[column][row] = cell
            }
        }
        return FormulaBoard(list)
    }

    companion object {
        fun from(board: Board): FormulaBoard = when {
            board.width < 8 -> fromSmallSizeBoard(board)
            board.width == 8 -> fromSameSizeBoard(board)
            else -> fromBigSizeBoard(board)
        }

        private fun fromSmallSizeBoard(board: Board): FormulaBoard {
            val (small, big) = (8 - board.width).let { it / 2 to (it / 2 + it % 2) }
            val columns = (0 until board.width).map { row ->
                (0 until board.height).map { column ->
                    board[board.Coordinate(row, column)]
                }
            }
            println(columns)
            val newColumns = List(small) { Column.create(8) } +
                columns.map { Column.create(small) + it + Column.create(big) } +
                List(big) { Column.create(8) }
            return FormulaBoard(newColumns).also { println(it.toDisplayString()) }
        }

        private fun fromSameSizeBoard(board: Board): FormulaBoard =
            (0 until board.width).map { row ->
                (0 until board.height).map { column ->
                    board[board.Coordinate(row, column)]
                }
            }.let { FormulaBoard(it) }

        private fun fromBigSizeBoard(board: Board): FormulaBoard {
            val (small, big) = (board.width - 8).let { it / 2 to (it / 2 + it % 2) }
            return (big until (board.width - small)).map { row ->
                (big until (board.height - small)).map { column ->
                    board[board.Coordinate(row, column)]
                }
            }
                .let { FormulaBoard(it) }
        }
    }
}
