class Solution {
    fun solution(s: String): String {
        var index = 0

        return s.indices.joinToString("") {
            if (it == 0 || s[it - 1] == ' ') index = 0

            if (index % 2 == 0) {
                index++
                s[it].uppercase()
            } else {
                index++
                s[it].lowercase()
            }
        }
    }
}