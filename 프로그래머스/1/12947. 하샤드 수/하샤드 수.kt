class Solution {
    fun solution(x: Int) = x % x.toString().sumOf { it.digitToInt() } == 0
}