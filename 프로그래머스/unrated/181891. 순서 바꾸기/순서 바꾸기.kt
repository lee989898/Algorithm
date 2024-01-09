class Solution {
    fun solution(num_list: IntArray, n: Int) = num_list.drop(n) + num_list.take(n)
}