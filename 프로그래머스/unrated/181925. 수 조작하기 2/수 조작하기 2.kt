class Solution {
    fun solution(numLog: IntArray) = (0 until numLog.size - 1).joinToString("") {
        when (numLog[it + 1] - numLog[it]) {
            1 -> "w"
            -1 -> "s"
            10 -> "d"
            -10 -> "a"
            else -> throw IllegalArgumentException()
        }
    }
}