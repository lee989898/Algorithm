class Solution {
    fun solution(arr: IntArray, idx: Int) = arr.indices.firstOrNull { it >= idx && arr[it] == 1 } ?: - 1
}