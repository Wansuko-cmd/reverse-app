package data

import FormulaBoard

val formulaData = rabbitFormulaData + tigerFormulaData

data class FormulaData(
    val board: FormulaBoard,
    val piece: Cell.Piece,
    val coordinate: FormulaBoard.FormulaCoordinate,
)
