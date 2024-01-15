class Solution {
    fun solution(code: String): String {
        var answer = ""
        var mode = false

        code.forEachIndexed { index, c ->

            if (c == '1') {
                mode = !mode
            } else if (mode && index % 2 != 0) {
                answer += c
            } else if (!mode && index % 2 == 0) {
                answer += c
            }
        }

        return answer.ifEmpty { "EMPTY" }
    }
}