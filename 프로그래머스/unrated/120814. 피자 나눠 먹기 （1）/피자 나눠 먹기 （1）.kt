class Solution {
    fun solution(n: Int) = if (n in 1..6) 1
    else n / 7 + if (n % 7 != 0) 1 else 0
}