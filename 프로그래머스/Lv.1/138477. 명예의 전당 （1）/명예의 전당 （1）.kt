import java.util.*

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = LinkedList<Int>()
        var result = intArrayOf()

        score.forEach {
            answer += it
            answer.sort()
            if (answer.size > k) {
                answer.remove()
            }
            result += answer.take(1)
        }

        return result
    }
}
