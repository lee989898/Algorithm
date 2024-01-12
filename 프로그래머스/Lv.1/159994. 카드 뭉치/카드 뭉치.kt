class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var cards1Index = 0
        var cards2Index = 0

        goal.forEachIndexed { index, s ->
            if (cards1Index < cards1.size && cards1[cards1Index] == s) cards1Index++
            else if (cards2Index < cards2.size && cards2[cards2Index] == s) cards2Index++
            else return "No"
        }

        return "Yes"
    }
}
