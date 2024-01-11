class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { query -> (query[0]..query[1]).forEach { arr[it] += 1 } }
        return arr
    }
}