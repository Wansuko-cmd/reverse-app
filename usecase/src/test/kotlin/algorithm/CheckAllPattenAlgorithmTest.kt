@file:Suppress("NonAsciiCharacters", "TestFunctionName")

package algorithm

import Board
import Cell
import CheckAllPattenAlgorithm
import Column
import black
import com.google.common.truth.Truth.assertThat
import nothing
import white
import kotlin.test.Test

class CheckAllPattenAlgorithmTest {
    private val target = CheckAllPattenAlgorithm()

    @Test
    fun 全ての局面を総当たりして最も駒が取れる手を選択する() {
        val board = Board.reconstruct(
            columns = listOf(
                Column.reconstruct(black(8)),
                Column.reconstruct(white(3) + black(2) + white(2) + black(1)),
                Column.reconstruct(black(1) + white(1) + black(1) + white(1) + black(1) + white(1) + black(2)),
                Column.reconstruct(black(1) + white(2) + black(1) + white(1) + black(3)),
                Column.reconstruct(black(1) + white(3) + black(4)),
                Column.reconstruct(black(2) + white(1) + black(5)),
                Column.reconstruct(nothing(1) + white(5) + black(1) + nothing(1)),
                Column.reconstruct(white(1) + nothing(1) + white(4) + nothing(1) + black(1)),
            ),
        )
        assertThat(target(board, Cell.Piece.Black)).isEqualTo(board.Coordinate(6, 0))
    }
}