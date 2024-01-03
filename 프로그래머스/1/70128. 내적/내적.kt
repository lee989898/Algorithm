class Solution {
    fun solution(a: IntArray, b: IntArray) = (0 until a.size).sumOf { a[it] * b[it] }
}