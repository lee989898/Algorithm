import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int) = when (setOf(a, b, c, d).size) {
        1 -> 1111 * a
        2 -> {
            when {
                a == b && c == d -> (a + c) * abs(a - c)
                a == c && b == d -> (a + b) * abs(a - b)
                a == d && b == c -> (a + b) * abs(a - b)
                a == b && b == c -> (10 * a + d) * (10 * a + d)
                a == b && b == d -> (10 * a + c) * (10 * a + c)
                a == c && c == d -> (10 * a + b) * (10 * a + b)
                else -> (10 * b + a) * (10 * b + a)
            }
        }

        3 -> {
            when {
                a == b -> c * d
                a == c -> b * d
                a == d -> b * c
                b == c -> a * d
                b == d -> a * c
                else -> a * b
            }
        }

        else -> minOf(a, b, c, d)
    }
}
