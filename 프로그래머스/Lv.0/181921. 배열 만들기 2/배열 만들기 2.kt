class Solution {
    fun solution(l: Int, r: Int) =
        (l..r).filter { number -> number.toString().all { it == '5' || it == '0' } }.ifEmpty { listOf(-1) }
}