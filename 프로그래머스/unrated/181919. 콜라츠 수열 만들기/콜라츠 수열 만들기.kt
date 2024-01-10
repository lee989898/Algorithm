class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var copyN = n

        while (copyN != 1) {
            answer += copyN

            if (copyN % 2 == 0) {
                copyN /= 2
            } else {
                copyN = 3 * copyN + 1
            }
        }
        answer += copyN

        return answer
    }
}