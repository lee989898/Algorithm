class Solution {
    fun solution(arr: IntArray, idx: Int) = (idx until arr.size).firstOrNull { it >= idx && arr[it] == 1 } ?: - 1
}