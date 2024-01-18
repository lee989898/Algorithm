import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int) =
        (1..number).map { measure(it) }.sumOf { if (it <= limit) it else power }

    private fun measure(number: Int): Int {
        var count = 0
        var i = 1
        while (true) {
            if (i * i >= number) break
            if (number % i++ == 0) count += 2
        }
        if (i * i == number) count++
        return count
    }
}