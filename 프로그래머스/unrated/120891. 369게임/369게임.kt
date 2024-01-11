class Solution {
    fun solution(order: Int) = "$order".count { it.digitToInt() != 0 && it.digitToInt() % 3 == 0 }
}