class Solution {
    fun solution(num_list: IntArray) = if (num_list.size > 10) num_list.sum()
    else num_list.reduce { acc, i -> acc * i }
}