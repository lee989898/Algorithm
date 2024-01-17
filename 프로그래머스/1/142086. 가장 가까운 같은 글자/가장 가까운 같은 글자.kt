class Solution {
    fun solution(s: String): IntArray {
        val answer = IntArray(s.length) { -1 }

        for (i in s.length - 1 downTo 1) {
            var count = 1

            for (j in i - 1 downTo 0) {
                if (s[i] == s[j]) {
                    answer[i] = count
                    break
                }

                count++
            }
        }

        return answer
    }
}