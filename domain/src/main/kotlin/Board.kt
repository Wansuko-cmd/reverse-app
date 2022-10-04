import PieceCount.Companion.vs

class Board private constructor(
    private val columns: List<Column>,
) {
    private val size = columns.size
    operator fun get(coordinate: Coordinate) = columns[coordinate.row][coordinate.column]
    private operator fun set(coordinate: Coordinate, value: Cell) {
        columns[coordinate.row][coordinate.column] = value
    }
    private fun getDirections(coordinate: Coordinate): List<List<Pair<Cell, Coordinate>>> {

        fun getLine(
            condition: (Coordinate) -> Coordinate?,
        ): List<Pair<Cell, Coordinate>> {
            tailrec fun getLine(
                coordinate: Coordinate?,
                acc: List<Pair<Cell, Coordinate>>,
            ): List<Pair<Cell, Coordinate>> =
                if (coordinate != null) getLine(condition(coordinate), acc + (this[coordinate] to coordinate))
                else acc
            return getLine(condition(coordinate), listOf())
        }

        return listOf(
            getLine { it.left },
            getLine { it.right },
            getLine { it.up },
            getLine { it.down },
            getLine { it.left?.up },
            getLine { it.right?.up },
            getLine { it.left?.down },
            getLine { it.right?.down },
        )
    }

    private fun placeableCoordinates(piece: Cell.Piece) =
        (0 until size)
            .flatMap { row -> (0 until size).map { column -> Coordinate(row, column) } }
            .filter { isPlaceable(it, piece) }
    
    private fun isPlaceable(
        coordinate: Coordinate,
        piece: Cell.Piece,
    ): Boolean {
        if (this[coordinate] !is Cell.Nothing) return false

        for (direction in getDirections(coordinate)) {
            if (direction.isPlaceableLine(piece)) return true
        }

        return false
    }

    private fun List<Pair<Cell, Coordinate>>.isPlaceableLine(piece: Cell.Piece): Boolean {
        if (this.first().first == piece || this.first().first is Cell.Nothing) return false
        for (cell in this) {
            when (cell.first) {
                is Cell.Nothing -> break
                piece -> return true
                else -> continue
            }
        }

        return false
    }

    private fun place(
        coordinate: Coordinate,
        piece: Cell.Piece,
    ): Board {
        if (!this.isPlaceable(coordinate, piece)) return this

        val newBoard = Board(columns)
        newBoard[coordinate] = piece
        for (direction in getDirections(coordinate)) {
            if (!direction.isPlaceableLine(piece)) continue
            for (cell in direction) {
                when (cell.first) {
                    Cell.Nothing, piece -> break
                    else -> newBoard[cell.second] = piece
                }
            }
        }

        return newBoard
    }
    
    fun count(): PieceCount =
        columns
            .map { it.count() }
            .fold(0 vs 0) { acc, column -> acc + column }

    inner class Coordinate(val row: Int, val column: Int) {
        val left get() = if (column in 1..size) Coordinate(row, column - 1) else null
        val up get() = if (row in 1..size) Coordinate(row - 1, column) else null
        val right get() = if (column in 0 until size) Coordinate(row, column + 1) else null
        val down get() = if (row in 0 until size) Coordinate(row + 1, column) else null
    }

    companion object {
        fun create(size: Int): Board {
            val board = Board(columns = List(size) { Column.create(size) })
            if (size >= 2) {
                val coordinate = board.Coordinate(size / 2, size / 2)
                board[coordinate] = Cell.Piece.White
                board[coordinate.right!!] = Cell.Piece.Black
                board[coordinate.down!!] = Cell.Piece.Black
                board[coordinate.right!!.down!!] = Cell.Piece.White
            }

            return board
        }
    }
}

private class Column private constructor(
    private val pieces: List<Cell>,
) : MutableList<Cell> by ArrayList(pieces) {
    fun count(): PieceCount =
        pieces.count { it == Cell.Piece.Black } vs pieces.count { it == Cell.Piece.White }

    companion object {
        fun create(size: Int) = Column(List(size) { Cell.Nothing })
    }
}
