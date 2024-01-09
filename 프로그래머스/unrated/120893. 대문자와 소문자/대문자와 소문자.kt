class Solution {
    fun solution(my_string: String) =
        my_string.map { if (it.isLowerCase()) it.uppercase() else it.lowercase() }.joinToString("")
}