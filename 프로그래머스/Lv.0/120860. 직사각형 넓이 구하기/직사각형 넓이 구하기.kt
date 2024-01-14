class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val x = dots.map { it[0] }.sorted()
        val y = dots.map { it[1] }.sorted()
        return (x.last() - x.first()) * (y.last() - y.first())
    }
}