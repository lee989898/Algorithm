class Solution {
    fun solution(num_str: String) = num_str.sumOf { it.digitToInt() }
}