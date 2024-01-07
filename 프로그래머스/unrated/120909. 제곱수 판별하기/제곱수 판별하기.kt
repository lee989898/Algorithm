import kotlin.math.sqrt;

class Solution {
    fun solution(n: Int) = if (sqrt(n.toDouble()).toLong() * sqrt(n.toDouble()).toLong() == n.toLong()) 1 else 2
}
