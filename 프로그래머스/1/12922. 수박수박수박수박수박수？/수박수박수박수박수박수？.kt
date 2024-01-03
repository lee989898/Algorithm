class Solution {
    fun solution(n: Int) = (1..n).joinToString("") { if (it % 2 != 0) "수" else "박" }
}