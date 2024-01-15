import kotlin.math.abs

class Solution {
    fun solution(dots: Array<IntArray>) = if (abs(dots[0][1] - dots[1][1]).toDouble() / abs(dots[0][0] - dots[1][0])
        == abs(dots[2][1] - dots[3][1]).toDouble() / abs(dots[2][0] - dots[3][0])
        ||
        (abs(dots[0][1] - dots[2][1]).toDouble() / abs(dots[0][0] - dots[2][0])
                == abs(dots[1][1] - dots[3][1]).toDouble() / abs(dots[1][0] - dots[3][0]))
        ||
        (abs(dots[0][1] - dots[3][1]).toDouble() / abs(dots[0][0] - dots[3][0])
                == abs(dots[1][1] - dots[2][1]).toDouble() / abs(dots[1][0] - dots[2][0]))
    ) 1 else 0
}