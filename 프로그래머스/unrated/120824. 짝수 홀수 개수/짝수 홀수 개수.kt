class Solution {
    fun solution(num_list: IntArray) = num_list.run { intArrayOf(this.count { it % 2 == 0}, this.count { it % 2 != 0} ) }
}