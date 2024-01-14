class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>) = queries.map { (s, e, k) ->
        arr.sliceArray(s..e).sorted().find { it > k } ?: -1
    }.toIntArray()
}
