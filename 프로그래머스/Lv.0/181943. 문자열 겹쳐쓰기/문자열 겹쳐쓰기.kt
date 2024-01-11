class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String =
        my_string.slice(0 until s) + overwrite_string + my_string.slice(overwrite_string.length + s until my_string.length)
}