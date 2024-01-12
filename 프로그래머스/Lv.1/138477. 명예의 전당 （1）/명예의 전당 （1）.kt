import java.util.*

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = intArrayOf()
        val pq = PriorityQueue<Int>()

        for (item in score) {
            pq.add(item)

            if (pq.size > k) {
                pq.poll()
            }
            answer += pq.peek()
        }
        return answer
    }
}