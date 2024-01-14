class Solution {
    fun solution(array: IntArray): Int {
        val group = array.groupBy { it }
        val max = group.maxOf { it.value.size }
        val filter = group.filter { it.value.size == max }.toList()
        
        return if (filter.size == 1) {
            filter[0].first
        } else {
            -1
        }
    }
}