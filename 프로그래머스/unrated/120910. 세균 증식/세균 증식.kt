class Solution {
    fun solution(n: Int, t: Int) = (1..t).fold(n) { acc, i -> acc * 2 }
}