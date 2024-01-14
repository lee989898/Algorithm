class Solution {
    fun solution(a: Int, b: Int): Int {
        val gcd = gcd(a, b)
        var newB = b / gcd
        val set = mutableSetOf<Int>()

        while (newB != 1) {

            for (i in 2..newB) {
                while (newB % i == 0) {
                    newB /= i
                    set += i
                }

                if (newB == 1) break
            }
        }

        return if (set.any { it != 2 && it != 5 }) 2 else 1
    }

    private fun gcd(num1: Int, num2: Int): Int {
        return if (num2 % num1 == 0) num1
        else gcd(num2 % num1, num1)
    }
}