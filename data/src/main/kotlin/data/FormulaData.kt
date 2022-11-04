package data

import FormulaBoard

val formulaData = rabbitFormulaData + tigerFormulaData + cowFormulaData

data class FormulaData(
    val board: FormulaBoard,
    val piece: Cell.Piece,
    val coordinate: FormulaBoard.FormulaCoordinate,
)
