/**
 * ボードの上の状態
 */
sealed interface Cell {
    object Nothing : Cell
    sealed interface Piece: Cell {
        object Black : Piece
        object White : Piece
    }
}

data class PieceCount(val black: Int, val white: Int) {
    operator fun plus(other: PieceCount) = this.black + other.black vs this.white + other.white
    companion object {
        infix fun Int.vs(white: Int) = PieceCount(black = this, white = white)
    }
}
