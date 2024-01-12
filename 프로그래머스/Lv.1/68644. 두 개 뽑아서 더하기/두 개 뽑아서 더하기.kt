class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = mutableSetOf<Int>()

        for (i in 0 until numbers.lastIndex) {
            for (j in i + 1..numbers.lastIndex) {
                answer.add(numbers[i] + numbers[j])
            }
        }

        return answer.sorted().toIntArray()
    }
}