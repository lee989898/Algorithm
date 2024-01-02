import kotlin.math.min
import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int) = (min(a, b)..max(a, b)).sumOf { it.toLong() }
}