class Solution {
    fun solution(n: Int, m: Int) = gcd(n, m).let { listOf(it, n * m / it) }

    private fun gcd(num1: Int, num2: Int): Int {
        return if (num1 % num2 == 0) {
            num2
        } else {
            gcd(num2, num1 % num2)
        }
    }
}