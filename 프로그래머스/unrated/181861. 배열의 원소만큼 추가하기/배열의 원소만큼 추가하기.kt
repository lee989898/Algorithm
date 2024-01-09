class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        arr.indices.forEach { index ->
            repeat(arr[index]) {
                answer += arr[index]
            }
        }

        return answer
    }
}