class Solution {
    fun solution(arr: IntArray, divisor: Int) = arr.filter { it % divisor == 0 }.sorted().ifEmpty { listOf(-1) }
}