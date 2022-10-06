import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DeviseNextMoveUseCase(
    private val randomAlgorithm: RandomAlgorithm,
    private val checkAllPattenAlgorithm: CheckAllPattenAlgorithm
) {
    /**
     *  次に置くべき駒の場所を返す
     *  置ける場所がない場合はnullを返す
     */
    suspend operator fun invoke(board: Board, piece: Cell.Piece): Board.Coordinate? =
        withContext(Dispatchers.Default) {
            when {
                board.countNothing() <= 10 -> checkAllPattenAlgorithm(board, piece)
                else -> randomAlgorithm(board, piece)
            }
        }
}
