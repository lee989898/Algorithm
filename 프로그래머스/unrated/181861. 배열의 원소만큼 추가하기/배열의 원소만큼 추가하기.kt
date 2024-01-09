class Solution {
    fun solution(arr: IntArray) = arr.flatMap { value -> List(value) { value } }
}