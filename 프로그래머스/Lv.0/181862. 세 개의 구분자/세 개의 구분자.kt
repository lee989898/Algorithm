class Solution {
    fun solution(myStr: String) = myStr.split("[a|b|c]".toRegex()).filter { it.isNotEmpty() }.ifEmpty { listOf("EMPTY") }
}