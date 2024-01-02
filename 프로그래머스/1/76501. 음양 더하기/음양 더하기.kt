class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray) =
        absolutes.foldIndexed(0) { index, sum, value -> if (signs[index]) sum + value else sum + -value }
}