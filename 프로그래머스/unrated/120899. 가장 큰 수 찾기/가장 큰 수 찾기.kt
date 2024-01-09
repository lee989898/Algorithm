class Solution {
    fun solution(array: IntArray) = array.maxOf { it }.let { intArrayOf(it, array.indexOf(it)) }
}