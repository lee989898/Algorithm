import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int) = array.sortedWith(
        compareBy(
            { abs(it - n) },
            { it }
        )
    ).first()
}