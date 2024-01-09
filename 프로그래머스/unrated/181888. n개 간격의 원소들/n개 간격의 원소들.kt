class Solution {
    fun solution(num_list: IntArray, n: Int) = num_list.filterIndexed { index, value -> index % n == 0 }
}