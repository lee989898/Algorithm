class Solution {
    fun solution(num_list: IntArray) =
        if (num_list.sum() * num_list.sum() > num_list.reduce { acc, i -> acc * i }) 1 else 0
}