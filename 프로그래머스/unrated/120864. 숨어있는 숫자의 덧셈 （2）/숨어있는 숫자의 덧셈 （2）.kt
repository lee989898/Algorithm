class Solution {
    fun solution(my_string: String) =
        my_string.split("[a-zA-Z]".toRegex()).filterNot { it.toIntOrNull() == null }.sumOf { it.toInt() }
}