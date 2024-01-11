class Solution {
    fun solution(date1: IntArray, date2: IntArray) = if (date1[0] == date2[0]) {
        if (date1[1] == date2[1]) {
            if (date1[2] < date2[2]) {
                1
            } else {
                0
            }
        } else if (date1[1] < date2[1]) {
            1
        } else {
            0
        }
    } else if (date1[0] < date2[0]) {
        1
    } else {
        0
    }
}
