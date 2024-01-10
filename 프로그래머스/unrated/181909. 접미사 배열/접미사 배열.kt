class Solution {
    fun solution(my_string: String) = my_string.indices.map { my_string.slice(it until my_string.length) }.sorted()
}