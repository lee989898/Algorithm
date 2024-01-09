class Solution {
    fun solution(arr: IntArray, delete_list: IntArray) = arr.subtract(delete_list.toSet())
}