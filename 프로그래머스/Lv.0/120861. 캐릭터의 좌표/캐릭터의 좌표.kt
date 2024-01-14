class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        val column = board[1] / 2
        val row = board[0] / 2

        var cx = 0
        var cy = 0

        keyinput.forEach {
            when (it) {
                "left" -> if (cx - 1 in -row..row) cx -= 1
                "right" -> if (cx + 1 in -row..row) cx += 1
                "up" -> if (cy + 1 in -column..column) cy += 1
                "down" -> if (cy - 1 in -column..column) cy -= 1
                else -> throw IllegalArgumentException()
            }
        }

        return intArrayOf(cx, cy)
    }
}