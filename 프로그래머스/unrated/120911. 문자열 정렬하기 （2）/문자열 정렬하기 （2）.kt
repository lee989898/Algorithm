class Solution {
    fun solution(my_string: String) = my_string.map { it.lowercase() }.sorted().joinToString("")
}