class Solution {
    fun solution(lines: Array<IntArray>): Int {
        val arr = IntArray(201)

        lines.forEach { line ->
            (line[0] until line[1]).forEach { arr[it + 100]++ }
        }

        return arr.count { it >= 2 }
    }
}