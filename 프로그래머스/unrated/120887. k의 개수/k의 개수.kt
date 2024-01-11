class Solution {
    fun solution(i: Int, j: Int, k: Int) = (i..j).sumOf { number -> number.toString().count { "$it" == "$k" } }
}