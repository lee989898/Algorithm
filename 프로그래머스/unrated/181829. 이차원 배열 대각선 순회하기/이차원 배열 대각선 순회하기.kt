class Solution {
    fun solution(board: Array<IntArray>, k: Int) =
        board.indices.sumOf { i -> board[i].indices.sumOf { j -> if (i + j <= k) board[i][j] else 0 } }
}