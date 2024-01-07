class Solution {
    fun solution(array: IntArray) = array.sorted().let { it[it.size / 2] }
}