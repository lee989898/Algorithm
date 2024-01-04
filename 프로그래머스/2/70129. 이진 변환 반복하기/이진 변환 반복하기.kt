class Solution {
    fun solution(s: String): IntArray {
        var copyS = s
        var removedZero = 0
        var countConversion = 0

        while (copyS.length != 1) {
            removedZero += copyS.replace("1", "").count()
            copyS = Integer.toBinaryString(copyS.replace("0", "").count())
            countConversion++
        }

        return intArrayOf(countConversion, removedZero)
    }
}