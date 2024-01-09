import kotlin.math.max

class Solution {
    fun solution(numbers: IntArray) =
        numbers.sorted().let { max(it[0] * it[1], it[it.lastIndex] * it[it.lastIndex - 1]) }
}