class Solution {
    fun solution(n: Int) = (1..100).first { 6 * it % n == 0 }
}