class Solution {
    fun solution(array: IntArray): Int {
        val group = array.groupBy { it }.entries
        val max = group.maxOf { it.value.size }
        val filter = group.filter { it.value.size == max }

        return if (filter.size == 1) {
            filter[0].key
        } else {
            -1
        }
    }
}