class Solution {
    fun solution(number: String) = number.sumOf { it.digitToInt() } % 9
}