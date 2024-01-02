class Solution {
    fun solution(arr: IntArray): List<Int> {
        val min = arr.minOf { it }
        return arr.filter { it != min }.ifEmpty { listOf(-1) }
    }
}