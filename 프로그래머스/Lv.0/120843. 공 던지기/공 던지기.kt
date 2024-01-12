class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        return (1..k).map { numbers }.flatMap { it.toList() }[2 * (k - 1)]
    }
}