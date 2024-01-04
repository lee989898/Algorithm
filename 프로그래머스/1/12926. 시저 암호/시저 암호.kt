    class Solution {
        fun solution(s: String, n: Int): String {
            val alphabet = ('a'..'z').toList()

            return s.map {
                if (it == ' ') it
                else if (it.isUpperCase()) alphabet[(it - 'A' + n) % 26].uppercase()
                else alphabet[(it - 'a' + n) % 26]
            }.joinToString("")
        }
    }