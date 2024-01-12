class Solution {
    fun solution(s: String) =
        s.toCharArray().groupBy { it }.filter { it.value.size == 1 }.flatMap { it.value }.sorted().joinToString("")
}