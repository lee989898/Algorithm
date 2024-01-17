class Solution {
    fun solution(answers: IntArray): List<Int> {
        val answer = IntArray(3)
        val one = intArrayOf(1, 2, 3, 4, 5)
        val two = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val three = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        for (i in answers.indices) {
            if (answers[i] == one[i % one.size]) {
                answer[0]++
            }
            if (answers[i] == two[i % two.size]) {
                answer[1]++
            }
            if (answers[i] == three[i % three.size]) {
                answer[2]++
            }
        }

        val max = answer.maxOf { it }

        val result = ArrayList<Int>()

        for (i in answer.indices) {
            if (answer[i] == max) {
                result.add(i + 1)
            }
        }

        return result
    }
}