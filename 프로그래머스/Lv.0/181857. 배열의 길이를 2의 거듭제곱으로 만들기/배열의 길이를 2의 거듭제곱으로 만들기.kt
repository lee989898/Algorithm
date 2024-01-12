class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr

        intArrayOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024).first { it >= arr.size }.let {
            while (answer.size != it) {
                answer += 0
            }
        }

        return answer
    }
}