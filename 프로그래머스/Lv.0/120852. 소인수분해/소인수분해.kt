class Solution {
    fun solution(n: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        var copyN = n

        for (i in 2..n) {
            while (copyN % i == 0) {
                answer += i
                copyN /= i
            }
        }

        return answer.distinct()
    }
}
