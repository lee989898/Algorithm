class Solution {
    fun solution(sides: IntArray): Int {
        var answer = 0

        val sidesMax = sides.maxOf { it }
        val sidesMin = sides.minOf { it }
        var other = sidesMax + 1
        var cur = sidesMax

        while (cur + sidesMin > sidesMax) {
            answer++
            cur--
        }

        while (sidesMin + sidesMax > other) {
            answer++
            other++
        }

        return answer
    }
}