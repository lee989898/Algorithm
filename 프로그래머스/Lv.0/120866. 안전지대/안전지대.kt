class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0

        val dx = intArrayOf(-1, 0, 1, -1, 1, -1, 0, 1)
        val dy = intArrayOf(-1, -1, -1, 0, 0, 1, 1, 1)

        for (i in board.indices) {
            for (j in board.indices) {
                if (board[i][j] == 1) {
                    for (k in 0 until 8) {
                        val nx = i + dx[k]
                        val ny = j + dy[k]

                        if (nx in 0 until board.size && ny in 0 until board.size && board[nx][ny] != 1) {
                            board[nx][ny] = 2
                        }
                    }
                }
            }
        }

        for (i in board.indices) {
            for (j in board.indices) {
                if (board[i][j] == 0) answer++
            }
        }

        return answer
    }
}