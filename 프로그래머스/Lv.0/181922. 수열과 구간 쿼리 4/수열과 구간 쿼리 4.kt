class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { (s, e, k) ->
            (s..e).forEach { if (it % k == 0) arr[it] += 1 }
        }
        return arr
    }
}