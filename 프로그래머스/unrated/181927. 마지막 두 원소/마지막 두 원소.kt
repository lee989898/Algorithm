class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list

        answer += if (num_list[num_list.lastIndex] > num_list[num_list.lastIndex - 1]) {
            num_list[num_list.lastIndex] - num_list[num_list.lastIndex - 1]
        } else {
            num_list[num_list.lastIndex] * 2
        }
        
        return answer
    }
}