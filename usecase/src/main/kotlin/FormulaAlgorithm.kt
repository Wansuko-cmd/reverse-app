class FormulaAlgorithm(
    private val formulaQueryService: FormulaQueryService,
) {
    suspend operator fun invoke(board: Board, piece: Cell.Piece): Board.Coordinate? =
        formulaQueryService
            .getCoordinate(FormulaBoard.from(board), piece)
            ?.toCoordinate(board)
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

    fun toDisplayString(): String = this.toString()
        .replace("Cell\$Nothing", " ")
        .replace("Cell\$Piece\$Black", "○")
        .replace("Cell\$Piece\$White", "●")

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
