class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        arr.indices.forEach { index ->
            if (flag[index]) {
                repeat(arr[index] * 2) {
                    answer += arr[index]
                }
            } else {
                answer = answer.take(answer.size - arr[index]).toIntArray()
            }
        }

        return answer
    }
}