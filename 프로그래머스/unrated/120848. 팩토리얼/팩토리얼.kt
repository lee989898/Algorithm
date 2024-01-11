class Solution {
    fun solution(n: Int) = generateSequence(1) {
        it + 1
    }.takeWhile { (1..it).reduce { acc, i -> acc * i } <= n }.last()
}
