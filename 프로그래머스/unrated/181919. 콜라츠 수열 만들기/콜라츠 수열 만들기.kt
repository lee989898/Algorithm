class Solution {
    fun solution(n: Int) = generateSequence(n) {
        when {
            it == 1 -> null
            it % 2 == 0 -> it / 2
            it % 2 != 0 -> 3 * it + 1
            else -> throw IllegalArgumentException()
        }
    }.toList()
}