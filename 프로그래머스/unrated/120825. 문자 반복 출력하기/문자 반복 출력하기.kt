class Solution {
    fun solution(my_string: String, n: Int) = my_string.map { "$it".repeat(n) }.joinToString("")
}