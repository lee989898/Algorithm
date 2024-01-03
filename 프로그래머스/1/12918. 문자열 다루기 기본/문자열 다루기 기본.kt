class Solution {
    fun solution(s: String) = (s.length == 4 || s.length == 6) && s.all { it in '0'..'9' }
}