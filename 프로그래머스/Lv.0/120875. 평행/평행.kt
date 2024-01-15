import kotlin.math.abs

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val (x1, x2, x3, x4) = intArrayOf(dots[0][0], dots[1][0], dots[2][0], dots[3][0])
        val (y1, y2, y3, y4) = intArrayOf(dots[0][1], dots[1][1], dots[2][1], dots[3][1])

        return if (abs((x1 - x2) * (y3 - y4)) == abs((y1 - y2) * (x3 - x4)) ||
            (abs((x1 - x3) * (y2 - y4)) == abs((y1 - y3) * (x2 - x4))) ||
            (abs((x1 - x4) * (y2 - y3)) == abs((y1 - y4) * (x2 - x3)))
        ) 1 else 0
    }
}