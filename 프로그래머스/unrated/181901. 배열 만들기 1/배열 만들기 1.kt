class Solution {
    fun solution(n: Int, k: Int) = (1..n).filter { it % k == 0 }
}