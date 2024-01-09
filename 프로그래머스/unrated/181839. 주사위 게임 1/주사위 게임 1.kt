import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int) = when {
            a % 2 != 0 && b % 2 != 0 -> a * a + b * b
            a % 2 == 0 && b % 2 == 0 -> abs(a - b)
            else -> 2 * (a + b)
        }
}