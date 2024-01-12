class Solution {
    fun solution(n: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        var copyN = n

        for (i in 2..n) {
            if (copyN == 1) break
            
            while (copyN % i == 0) {
                answer += i
                copyN /= i
            }
        }

        return answer.distinct()
    }
}
