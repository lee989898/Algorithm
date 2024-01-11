class Solution {
    fun solution(num_list: IntArray) = num_list.sumOf { num ->
        generateSequence(num) {
            if (it == 1) null
            else if (it % 2 == 0) it / 2
            else (it - 1) / 2
        }.toList().size - 1
    }
}
