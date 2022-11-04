package data

import FormulaBoard
import black
import nothing
import white

private val tigerDefaultFormulaData = listOf(
    // f5
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(5, 4)
    ),
    // d6
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
        coordinate = FormulaBoard.FormulaCoordinate(3, 5)
    ),
    // c3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(2, 2)
    ),
    // d3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(3, 2)
    ),
    // c4
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(2, 3)
    ),
    // f4
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(5, 3)
    ),
)

private val largeAmountOfTigerFormula = listOf(
    // c5
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(2, 4)
    ),
    // b3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(1, 2)
    ),
    // c2
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(2, 1)
    ),
    // e3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + black(1) + black(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(4, 2)
    ),
    // d2
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + black(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(3, 1)
    ),
    // c6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + black(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + black(1) + black(1) + black(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(2, 5)
    ),
    // b4
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + black(1) + white(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + black(1) + black(1) + black(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(1, 3)
    ),
)

val stephenson = listOf(
    // f6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(5, 5)
    ),
    // f3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(5, 2)
    ),
    // e6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(4, 5)
    ),
    // e7
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(4, 6)
    ),
    // d7
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + white(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(3, 6)
    ),
    // g6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + black(1) + white(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(6, 5)
    ),
    // f8
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + black(1) + white(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + white(1) + black(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(5, 7)
    ),
    // f7
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + white(1) + black(1) + nothing(1) + black(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(5, 6)
    ),
    // g5
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + white(1) + white(1) + white(1) + black(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(6, 4)
    ),
    // h6
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + white(1) + black(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(7, 5)
    ),
    // h4
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + white(1) + black(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + white(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(7, 3)
    ),
    // g4
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + white(1) + black(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + nothing(1) + white(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(6, 3)
    ),
    // h3
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + white(1) + black(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + nothing(1) + white(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(7, 2)
    ),
    // h5
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + white(1) + black(1),
                nothing(1) + nothing(1) + nothing(1) + black(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + white(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.White,
        coordinate = FormulaBoard.FormulaCoordinate(7, 4)
    ),
    // h7
    FormulaData(
        board = FormulaBoard(
            listOf(
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + nothing(1) + nothing(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + black(1) + black(1) + black(1) + nothing(1),
                nothing(1) + nothing(1) + white(1) + white(1) + black(1) + black(1) + white(1) + black(1),
                nothing(1) + nothing(1) + nothing(1) + white(1) + white(1) + white(1) + nothing(1) + nothing(1),
                nothing(1) + nothing(1) + black(1) + black(1) + white(1) + white(1) + nothing(1) + nothing(1)
            )
        ),
        piece = Cell.Piece.Black,
        coordinate = FormulaBoard.FormulaCoordinate(7, 6)
    ),
)

val tigerFormulaData = tigerDefaultFormulaData + largeAmountOfTigerFormula + stephenson
