class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var answer: Array<IntArray> = arr

        val column = arr.size
        val row = arr[0].size

        if (column > row) {
            answer.forEachIndexed { index, _ ->
                repeat(column - row) {
                    answer[index] = answer[index] + 0
                }
            }
        } else if (row > column) {
            repeat(row - column) {
                answer += IntArray(row)
            }
        }

        return answer
    }
}