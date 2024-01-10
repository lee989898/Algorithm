class Solution {
    fun solution(numLog: IntArray) = (1..numLog.lastIndex).joinToString("") {
        when (numLog[it] - numLog[it - 1]) {
            1 -> "w"
            -1 -> "s"
            10 -> "d"
            -10 -> "a"
            else -> throw IllegalArgumentException()
        }
    }
}