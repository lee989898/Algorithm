class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer = 0

        score.sortedDescending().chunked(m).forEach { s ->
            if (s.size == m) {
                answer += s.minOf { it } * m
            }
        }

        return answer
    }
}