class Board private constructor(
    columns: List<Column>,
): List<Column> by ArrayList(columns) {
    companion object {
        fun create(size: Int) = Board(List(size) { Column.create(size) })
    }
}

class Column private constructor(pieces: List<Piece>) : List<Piece> by ArrayList(pieces) {
    companion object {
        fun create(size: Int) = Column(List(size) { Piece.Nothing })
    }
}

enum class Piece {
    Nothing,
    Black,
    White;
}