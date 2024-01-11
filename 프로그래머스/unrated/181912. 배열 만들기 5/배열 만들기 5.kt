class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int) =
        intStrs.map { it.slice(s until s + l).toInt() }.filter { it > k }
}