import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer = Int.MAX_VALUE
        var value = 0

        array.forEach {

            if (answer > abs(it - n)) {
                answer = abs(it - n)
                value = it
            } else if (abs(it - n) == answer) {
                if (value > it) {
                    value = it
                }
            }
        }

        return value
    }
}