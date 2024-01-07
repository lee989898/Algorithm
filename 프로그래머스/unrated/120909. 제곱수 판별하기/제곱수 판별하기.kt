import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 2

        (1..sqrt(n.toDouble()).toInt()).forEach {
            if (it * it == n) answer = 1
        }

        return answer
    }
}