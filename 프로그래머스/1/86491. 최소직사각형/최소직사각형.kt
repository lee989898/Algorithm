class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var left = 0
        var right = 0

        sizes.forEach {
            left = maxOf(left, maxOf(it[0], it[1]))
            right = maxOf(right, minOf(it[0], it[1]))
        }

        return left * right
    }
}