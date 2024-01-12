class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var copyCards1 = cards1.toList()
        var copyCards2 = cards2.toList()

        for (index in goal.indices) {
            if (copyCards1.isNotEmpty() && goal[index] == copyCards1.first()) {
                copyCards1 = copyCards1.drop(1)
            } else if (copyCards2.isNotEmpty() && goal[index] == copyCards2.first()) {
                copyCards2 = copyCards2.drop(1)
            } else {
                return "No"
            }
        }

        return "Yes"
    }
}