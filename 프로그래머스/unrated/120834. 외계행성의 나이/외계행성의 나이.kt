class Solution {
    fun solution(age: Int): String {
        val alphabet = ('a'..'j').toList()
        return age.toString().map { alphabet[it.digitToInt()] }.joinToString("")
    }
}