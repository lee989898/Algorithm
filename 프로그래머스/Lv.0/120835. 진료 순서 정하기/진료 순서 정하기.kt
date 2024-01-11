class Solution {
    fun solution(emergency: IntArray) =
        emergency.sortedDescending().let { sortedEmergency -> emergency.map { sortedEmergency.indexOf(it) + 1 } }
}