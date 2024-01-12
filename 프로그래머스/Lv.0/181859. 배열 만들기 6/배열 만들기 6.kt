class Solution {
    fun solution(arr: IntArray): List<Int> {
        var stk = listOf<Int>()
        var i = 0

        while (i < arr.size) {
            if (stk.isEmpty() || stk.last() != arr[i]) {
                stk += arr[i]
                i++
            } else if (stk.last() == arr[i]) {
                stk = stk.dropLast(1)
                i++
            }
        }

        return stk.ifEmpty { listOf(-1) }
    }
}
