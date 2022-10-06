class RandomAlgorithm {
    operator fun invoke(board: Board, piece: Cell.Piece): Board.Coordinate? {
        val coordinates = board.placeableCoordinates(piece)
        if (coordinates.isEmpty()) return null
        return coordinates.random()
    }
}