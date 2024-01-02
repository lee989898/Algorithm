class Solution {
    fun solution(num: Int): Int {
        var newNum = num.toLong()
        var count = 0

        while (true) {
            if (newNum == 1L) {
                break
            }

            if (count == 500) {
                return -1
            }

            count += 1

            newNum = if (newNum % 2 == 0L) {
                newNum / 2
            } else {
                newNum * 3 + 1
            }
        }

        return count
    }
}