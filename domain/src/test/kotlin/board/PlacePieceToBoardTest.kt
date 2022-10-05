@file:Suppress("NonAsciiCharacters", "TestFunctionName")

package board

import Board
import com.google.common.truth.Truth.assertThat
import kotlin.test.Test

class PlacePieceToBoardTest {
    @Test
    fun place関数でBoardにPieceを置いた結果を取得() {
        val board = Board.create(8)
        assertThat(board.place(coordinate = board.Coordinate(3, 2), piece = Cell.Piece.Black))
            .isEqualTo(
                Board.reconstruct(
                    columns = listOf(
                        Column.reconstruct(List(8) { Cell.Nothing }),
                        Column.reconstruct(List(8) { Cell.Nothing }),
                        Column.reconstruct(List(8) { Cell.Nothing }),
                        Column.reconstruct(List(2) { Cell.Nothing } + List(3) { Cell.Piece.Black } + List(3) { Cell.Nothing }),
                        Column.reconstruct(List(3) { Cell.Nothing } + Cell.Piece.Black + Cell.Piece.White + List(3) { Cell.Nothing }),
                        Column.reconstruct(List(8) { Cell.Nothing }),
                        Column.reconstruct(List(8) { Cell.Nothing }),
                        Column.reconstruct(List(8) { Cell.Nothing }),
                    ),
                )
            )
    }

    @Test
    fun 置けるところではなければ同じBoardを返す() {
        val board = Board.create(8)
        assertThat(board.place(coordinate = board.Coordinate(0, 0), piece = Cell.Piece.Black))
            .isEqualTo(board)
    }
}