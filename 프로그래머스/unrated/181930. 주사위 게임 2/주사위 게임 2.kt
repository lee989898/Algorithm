class Solution {
    fun solution(a: Int, b: Int, c: Int) = when (setOf(a, b, c).size) {
        1 -> (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
        2 -> (a + b + c) * (a * a + b * b + c * c)
        3 -> a + b + c
        else -> throw IllegalArgumentException()
    }
}