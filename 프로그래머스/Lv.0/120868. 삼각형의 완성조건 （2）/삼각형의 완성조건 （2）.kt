import kotlin.math.abs

class Solution {
    fun solution(sides: IntArray) = sides.sum() - abs(sides[0] - sides[1]) - 1
}