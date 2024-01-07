class Solution {
    fun solution(s1: Array<String>, s2: Array<String>) = s1.intersect(s2.toSet()).size
}