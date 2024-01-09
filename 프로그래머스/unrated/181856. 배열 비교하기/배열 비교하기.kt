class Solution {
    fun solution(arr1: IntArray, arr2: IntArray) = when {
        arr1.size > arr2.size -> 1
        arr2.size > arr1.size -> -1
        arr1.sum() > arr2.sum() -> 1
        arr2.sum() > arr1.sum() -> -1
        arr1.sum() == arr2.sum() -> 0
        else -> throw IllegalArgumentException()
    }
}