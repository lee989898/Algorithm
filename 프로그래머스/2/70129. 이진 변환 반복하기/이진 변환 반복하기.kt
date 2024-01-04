class Solution {
    fun solution(s: String): IntArray {
        var copyS = s
        var countZero = 0
        var countConversion = 0

        while (copyS.length != 1) {
            val removedZero = copyS.length - copyS.replace("0", "").count()
            copyS = Integer.toBinaryString(copyS.length - removedZero).toString()
            countZero += removedZero
            countConversion += 1
        }

        return intArrayOf(countConversion, countZero)
    }
}