import PieceCount.Companion.vs

class Board private constructor(
    private val columns: List<Column>,
) {
    // 8×8のボードなら8を代入
    private val size = columns.size
    operator fun get(coordinate: Coordinate) = columns[coordinate.row][coordinate.column]
    private operator fun set(coordinate: Coordinate, value: Cell) {
        columns[coordinate.row][coordinate.column] = value
    }

    override fun toString(): String = columns
        .joinToString { "[$it]" }
        .let { "Board($it)" }

    override fun equals(other: Any?): Boolean = other is Board && this.columns == other.columns
    override fun hashCode(): Int = columns.hashCode()

    private fun getLinesStatus(coordinate: Coordinate): List<LineStatus> {
        fun getLineStatus(condition: (Coordinate) -> Coordinate?): LineStatus =
            LineStatus(
                cells = generateSequence(condition(coordinate), condition)
                    .toList()
                    .map { this[it] to it }
            )


        return listOf(
            getLineStatus { it.left },
            getLineStatus { it.right },
            getLineStatus { it.up },
            getLineStatus { it.down },
            getLineStatus { it.left?.up },
            getLineStatus { it.right?.up },
            getLineStatus { it.left?.down },
            getLineStatus { it.right?.down },
        )
    }

    fun count(): PieceCount =
        columns
            .map { it.count() }
            .fold(0 vs 0) { acc, column -> acc + column }

    fun placeableCoordinates(piece: Cell.Piece) =
        (0 until size)
            .flatMap { row -> (0 until size).map { column -> Coordinate(row, column) } }
            .filter { coordinate -> this.isPlaceable(coordinate, piece) }

    fun place(
        coordinate: Coordinate,
        piece: Cell.Piece,
    ): Board {
        val newBoard = reconstruct(columns)
        newBoard[coordinate] = piece
        for (lineStatus in getLinesStatus(coordinate)) {
            if (!lineStatus.isPlaceableLine(piece)) continue
            for (cell in lineStatus) {
                when (cell.first) {
                    Cell.Nothing, piece -> break
                    else -> newBoard[cell.second] = piece
                }
            }
        }

        return newBoard
    }

    private fun isPlaceable(
        coordinate: Coordinate,
        piece: Cell.Piece,
    ): Boolean {
        if (this[coordinate] !is Cell.Nothing) return false

        for (lineStatus in getLinesStatus(coordinate)) {
            if (lineStatus.isPlaceableLine(piece)) return true
        }

        return false
    }

    /**
     * ボード上の座標
     * (0,0)から開始
     * 縦軸 -> row, 横軸 -> column ((2, 3)だと、上から2つめ、左から3つめの座標を指す）
     */
    inner class Coordinate(val row: Int, val column: Int) {
        val left get() = if (column in 1 until  size) Coordinate(row, column - 1) else null
        val up get() = if (row in 1 until  size) Coordinate(row - 1, column) else null
        val right get() = if (column in 0 until size - 1) Coordinate(row, column + 1) else null
        val down get() = if (row in 0 until size - 1) Coordinate(row + 1, column) else null
        override fun toString(): String = "Coordinate(row: $row, column: $column)"
        override fun equals(other: Any?): Boolean =
            other is Coordinate && row == other.row && column == other.column
        override fun hashCode(): Int = 31 * row + column
    }

    companion object {
        fun create(size: Int): Board {
            val board = Board(columns = List(size) { Column.create(size) })
            if (size >= 2) {
                val coordinate = board.Coordinate((size - 1) / 2, (size - 1) / 2)
                board[coordinate] = Cell.Piece.White
                board[coordinate.right!!] = Cell.Piece.Black
                board[coordinate.down!!] = Cell.Piece.Black
                board[coordinate.right!!.down!!] = Cell.Piece.White
            }

            return board
        }

        fun reconstruct(columns: List<Column>): Board = Board(columns)
    }
}

class Column private constructor(
    pieces: List<Cell>,
) : MutableList<Cell> by ArrayList(pieces) {
    fun count(): PieceCount =
        this.count { it == Cell.Piece.Black } vs this.count { it == Cell.Piece.White }

    override fun toString(): String = this.joinToString { it.javaClass.name }
    override fun equals(other: Any?): Boolean =
        other is Column && this.zip(other).all { it.first == it.second }
    override fun hashCode(): Int = javaClass.hashCode()

    companion object {
        fun create(size: Int) = Column(List(size) { Cell.Nothing })
        fun reconstruct(piece: List<Cell>) = Column(piece)
    }
}

/**
 * 特定の座標から一方向に存在するセルとその座標のリスト（自身は含まない）
 */
data class LineStatus(
    private val cells: List<Pair<Cell, Board.Coordinate>> = listOf(),
) : List<Pair<Cell, Board.Coordinate>> by ArrayList(cells) {
    operator fun plus(other: Pair<Cell, Board.Coordinate>) = LineStatus(cells + other)

    /**
     * 引数に渡された駒を置いた時にひっくり返せる駒が存在するかどうか
     */
    fun isPlaceableLine(piece: Cell.Piece): Boolean {
        if (this.firstOrNull()?.first == piece || this.firstOrNull()?.first is Cell.Nothing) return false
        for (cell in this) {
            when (cell.first) {
                is Cell.Nothing -> break
                piece -> return true
                else -> continue
            }
        }

        return false
    }
}