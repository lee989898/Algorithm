class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val list = rank.zip(attendance.toList()).sortedBy { it.first }.filter { it.second }
        return 10_000 * rank.indexOf(list[0].first) + 100 * rank.indexOf(list[1].first) + rank.indexOf(list[2].first)
    }
}