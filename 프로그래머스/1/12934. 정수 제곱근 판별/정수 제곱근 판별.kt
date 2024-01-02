import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val sqrt = sqrt(n.toDouble()).toLong()
        
        if(sqrt * sqrt == n) {
            return (sqrt.toLong() + 1) * (sqrt.toLong() + 1)
        } else {
            return -1L
        }
    }
}