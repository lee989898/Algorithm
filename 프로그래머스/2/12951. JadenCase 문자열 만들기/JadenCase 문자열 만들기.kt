class Solution {
    fun solution(s: String) = s.mapIndexed { index, char ->
        if (index == 0 || s[index - 1] == ' ') {
            char.uppercase()
        } else {
            char.lowercase()
        }
    }.joinToString("")
}