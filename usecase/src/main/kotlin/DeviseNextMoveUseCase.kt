import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DeviseNextMoveUseCase(
    private val formulaAlgorithm: FormulaAlgorithm,
    private val leavePlaceableCoordinateAlgorithm: LeavePlaceableCoordinateAlgorithm,
    private val checkAllPattenAlgorithm: CheckAllPattenAlgorithm,
) {
    /**
     *  次に置くべき駒の場所を返す
     *  置ける場所がない場合はnullを返す
     */
    suspend operator fun invoke(
        board: Board,
        piece: Cell.Piece,
        useFormula: Boolean = true,
    ): Board.Coordinate? =
        withContext(Dispatchers.Default) {
            if (useFormula) formulaAlgorithm(board, piece)?.let {
                if (board.placeableCoordinates(piece).contains(it)) return@withContext it
            }
            when {
                board.countNothing() <= 11 -> checkAllPattenAlgorithm(board, piece)
                else -> leavePlaceableCoordinateAlgorithm(board, piece)
            }
        }
}
