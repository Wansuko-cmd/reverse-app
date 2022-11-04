package data

import FormulaBoard
import black
import nothing
import white

val rabbitFormulaData = listOf(
    // f5
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(8),
                nothing(3) + white(1) + black(1) + nothing(3),
                nothing(3) + black(1) + white(1) + nothing(3),
                nothing(8),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(5, 4),
    ),
    // d6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(8),
                nothing(3) + white(1) + black(1) + nothing(3),
                nothing(3) + black(2) + nothing(3),
                nothing(4) + black(1) + nothing(3),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(3, 5),
    ),
    // c5
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(8),
                nothing(3) + white(3) + nothing(2),
                nothing(3) + black(2) + nothing(3),
                nothing(4) + black(1) + nothing(3),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(2, 4),
    ),
    // f4
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(4) + black(1) + nothing(3),
                nothing(3) + white(1) + black(1) + white(1) + nothing(2),
                nothing(3) + black(2) + nothing(3),
                nothing(4) + black(1) + nothing(3),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(5, 3),
    ),
    // e3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(4) + black(1) + nothing(3),
                nothing(3) + white(1) + black(1) + white(1) + nothing(2),
                nothing(3) + white(2) + nothing(3),
                nothing(3) + white(1) + black(1) + nothing(3),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(4, 2),
    ),
    // c6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(4) + black(1) + nothing(3),
                nothing(3) + black(2) + white(1) + nothing(2),
                nothing(2) + black(1) + white(2) + nothing(3),
                nothing(3) + white(1) + black(1) + nothing(3),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(2, 5),
    ),
    // d3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(4) + black(1) + white(1) + nothing(2),
                nothing(3) + black(1) + white(2) + nothing(2),
                nothing(2) + black(1) + white(2) + nothing(3),
                nothing(3) + white(1) + black(1) + nothing(3),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(3, 2),
    ),
    // f6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(4) + black(1) + white(1) + nothing(2),
                nothing(2) + black(2) + white(2) + nothing(2),
                nothing(2) + black(2) + white(1) + nothing(3),
                nothing(3) + white(1) + black(1) + nothing(3),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(5, 5),
    ),
    // e6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(4) + black(1) + white(1) + nothing(2),
                nothing(2) + black(2) + white(2) + nothing(2),
                nothing(2) + black(2) + white(1) + nothing(3),
                nothing(3) + white(3) + nothing(2),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(4, 5),
    ),
    // d7
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(4) + black(1) + white(1) + nothing(2),
                nothing(2) + black(2) + white(2) + nothing(2),
                nothing(2) + black(4) + nothing(2),
                nothing(3) + white(3) + nothing(2),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(3, 6),
    ),
    // g3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(4) + black(1) + white(1) + nothing(2),
                nothing(2) + black(2) + white(3) + nothing(1),
                nothing(2) + black(3) + white(1) + nothing(2),
                nothing(3) + white(3) + nothing(2),
                nothing(8),
                nothing(8),
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(6, 2),
    ),
    // c4
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(8),
                nothing(8),
                nothing(4) + black(1) + white(1) + nothing(2),
                nothing(2) + black(2) + white(3) + nothing(1),
                nothing(2) + black(3) + white(1) + nothing(2),
                nothing(3) + black(1) + white(2) + nothing(2),
                nothing(2) + black(1) + nothing(5),
                nothing(8),
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(2, 3),
    ),
)
