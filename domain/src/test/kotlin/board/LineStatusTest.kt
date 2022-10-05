@file:Suppress("NonAsciiCharacters", "TestFunctionName")

package board

import Board
import LineStatus
import com.google.common.truth.Truth.assertThat
import kotlin.test.Test

class LineStatusTest {
    private val board = Board.create(8)

    @Test
    fun 挟める状態だとtrueを返す() {
        val lineStatus = LineStatus(
            List(5) { Cell.Piece.Black to board.Coordinate(1, it) } +
                    (Cell.Piece.White to board.Coordinate(1, 6)),
        )
        assertThat(lineStatus.isPlaceableLine(Cell.Piece.White)).isTrue()
        assertThat(lineStatus.isPlaceableLine(Cell.Piece.Black)).isFalse()
    }
}