class Solution {
    fun solution(score: Array<IntArray>): List<Int> {
        val averages = score.map { it.average() }
        val sortedAverages = averages.sortedDescending()
        return averages.map { sortedAverages.indexOf(it) + 1 }
    }
}