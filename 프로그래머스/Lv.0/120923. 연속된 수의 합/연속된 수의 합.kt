class Solution {
    fun solution(num: Int, total: Int): List<Int> {
        val center = total / num
        return if(num % 2 == 0) {
            (center - (num / 2 - 1) .. center + num / 2)
        } else {
            (center - (num - 1) / 2 .. center + (num - 1) / 2)
        }.toList()
    }
}