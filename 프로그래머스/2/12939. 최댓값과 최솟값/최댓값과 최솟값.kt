class Solution {
    fun solution(s: String) =
        s.split(" ").map { it.toInt() }.let { numbers -> "${numbers.minOf { it }} ${numbers.maxOf { it }}" }
}