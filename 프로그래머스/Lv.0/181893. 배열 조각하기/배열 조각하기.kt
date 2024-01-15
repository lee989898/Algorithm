class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer: IntArray = arr

        query.forEachIndexed { index, i ->
            answer = if (index % 2 == 0) {
                answer.sliceArray(0..i)
            } else {
                answer.sliceArray(i..answer.lastIndex)
            }
        }

        return answer
    }
}