class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val child = numer1 * denom2 + numer2 * denom1
        val parent = denom1 * denom2
        val gcd = gcd(maxOf(child, parent), minOf(child, parent))

        return intArrayOf(child / gcd, parent / gcd)
    }

    private fun gcd(num1: Int, num2: Int): Int {
        return if (num1 % num2 == 0) num2
        else gcd(num2, num1 % num2)
    }
}