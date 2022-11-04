fun main() {
    var board = Board.create(8)
    while (
        board.countNothing() > 0 &&
        (board.placeableCoordinates(Cell.Piece.Black) + board.placeableCoordinates(Cell.Piece.White)).isNotEmpty()
    ) {
        board = placePiece(board, Cell.Piece.Black)
        board = placePiece(board, Cell.Piece.White)
    }
}

fun placePiece(board: Board, piece: Cell.Piece): Board {
    if (board.placeableCoordinates(piece).isEmpty()) return board
    println(board.toDisplayString())
    println(board.placeableCoordinates(piece))
    val input = readLine() ?: throw Exception()
    val coordinate = board.Coordinate(input[0].toRow(), input[1].toColumn())
    println(printString(input[0].toString() + input[1].toString(), board, piece, coordinate))
    return board.place(coordinate, piece)
}

fun printString(
    comment: String,
    board: Board,
    piece: Cell.Piece,
    coordinate: Board.Coordinate,
) = """
        // $comment
        FormulaData(
            board = FormulaBoard(
                listOf(
                    ${board.toS()}
                )
            ),
            piece = ${piece.toS()},
            coordinate = FormulaBoard.FormulaCoordinate(${coordinate.row}, ${coordinate.column})
        ),
    """.trimIndent()

fun Cell.Piece.toS(): String = when (this) {
    is Cell.Piece.White -> "Cell.Piece.White"
    is Cell.Piece.Black -> "Cell.Piece.Black"
}

fun Board.toS(): String =
    (0 until this.width).map { row ->
        (0 until this.height).map { column ->
            this[Coordinate(row, column)]
        }
    }.joinToString(separator = ",\n") { cells ->
        cells.joinToString(separator = " + ") { cell ->
            when (cell) {
                is Cell.Nothing -> "nothing(1)"
                is Cell.Piece.White -> "white(1)"
                is Cell.Piece.Black -> "black(1)"
            }
        }
    }

fun Char.toRow() = when (this) {
    'a' -> 0
    'b' -> 1
    'c' -> 2
    'd' -> 3
    'e' -> 4
    'f' -> 5
    'g' -> 6
    'h' -> 7
    else -> throw Exception()
}

fun Char.toColumn() = when (this) {
    '1' -> 0
    '2' -> 1
    '3' -> 2
    '4' -> 3
    '5' -> 4
    '6' -> 5
    '7' -> 6
    '8' -> 7
    else -> throw Exception()
}
