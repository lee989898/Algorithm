class Solution {
    fun solution(my_string: String) = my_string.filter { it.isDigit() }.sumOf { it.digitToInt() }
}