fun main() {
    var board = Board.create(8)
    while (board.countNothing() > 0) {
        board = placeByPlayer(board, Cell.Piece.Black)
        board = placeByPlayer(board, Cell.Piece.White)
    }
}

fun placeByPlayer(board: Board, piece: Cell.Piece): Board {
    if (board.placeableCoordinates(piece).isEmpty()) return board
    println(board.toDisplayString())
    println(board.placeableCoordinates(piece))
    val blackCoordinate = readCoordinate(board, piece)
    return board.place(blackCoordinate, piece)
}

fun readCoordinate(board: Board, piece: Cell.Piece): Board.Coordinate {
    while (true) {
        val input = readLine()
            ?.replace(" ", "")
            ?.split(',')
            ?.map { it.toIntOrNull() }
        println(input)
        if (
            input?.count() == 2 &&
            input.all { it != null } &&
            0 < input[0]!! && input[0]!! < board.height &&
            0 < input[1]!! && input[1]!! < board.width
        ) {
            val coordinate = board.Coordinate(row = input[0]!!, column = input[1]!!)
            if (board.placeableCoordinates(piece).contains(coordinate)) return coordinate
        }
        println("無効な入力")
    }
}

fun Board.toDisplayString(): String = this.toString()
    .replace("Cell\$Nothing", " ")
    .replace("Cell\$Piece\$Black", "○")
    .replace("Cell\$Piece\$White", "●")
