class Solution {
    fun solution(n: Int) = (4..n).count { number -> (1..number).count { number % it == 0 } >= 3 }
}