class Solution {
    fun solution(arr: IntArray) = if (arr.indexOf(2) == -1) {
        intArrayOf(-1)
    } else {
        arr.sliceArray(arr.indexOf(2)..arr.lastIndexOf(2))
    }
}