class Solution {
    fun solution(arr: IntArray, n: Int) =
        if (arr.size % 2 == 0) {
            arr.mapIndexed { index, value -> if (index % 2 != 0) value + n else value }
        } else {
            arr.mapIndexed { index, value -> if (index % 2 == 0) value + n else value }
        }
}