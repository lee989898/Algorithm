class Solution {
    fun solution(myString: String) = myString.map {
        when (it) {
            'a' -> 'A'
            in 'B'..'Z' -> it.lowercase()
            else -> it
        }
    }.joinToString("")
}