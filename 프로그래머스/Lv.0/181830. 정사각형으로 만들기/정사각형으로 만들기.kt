import kotlin.math.max

class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val max = max(arr.size, arr[0].size)
        val array = Array(max) { IntArray(max) }

        for (i in arr.indices) {
            arr[i].copyInto(array[i])
        }
        return array
    }
}