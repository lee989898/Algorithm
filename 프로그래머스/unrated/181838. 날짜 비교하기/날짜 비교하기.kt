import java.time.LocalDate

class Solution {
    fun solution(date1: IntArray, date2: IntArray) =
        if (LocalDate.of(date1[0], date1[1], date1[2]) < LocalDate.of(date2[0], date2[1], date2[2])) 1 else 0
}
