package data

import FormulaBoard
import black
import nothing
import white

val CowDefaultFormulaData = listOf(
    // f6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(5, 5)
    ),
    // e6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(4, 5)
    ),
    // f4
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(5, 3)
    ),
    // e3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(4, 2)
    ),
    // c5
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(2, 4)
    ),
    // c4
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + white(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(2, 3)
    ),
    // e7
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + white(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(4, 6)
    ),
    // c6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + white(1) + white(1) + white(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(2, 5)
    ),
    // e2
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + white(1) + white(1) + white(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(4, 1)
    ),
)

val cowFormulaData = CowDefaultFormulaData
