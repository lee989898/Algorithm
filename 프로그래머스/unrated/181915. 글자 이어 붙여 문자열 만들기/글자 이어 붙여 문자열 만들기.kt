class Solution {
    fun solution(my_string: String, index_list: IntArray) = index_list.map { my_string[it] }.joinToString("")
}