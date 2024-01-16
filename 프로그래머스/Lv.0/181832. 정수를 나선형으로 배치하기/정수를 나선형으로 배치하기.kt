class Solution {
    fun solution(n: Int): Array<IntArray> {
        val answer = Array(n) { IntArray(n) }

        var i = 0
        var j = 0
        var num = 1
        var direction = "right"

        while (num <= n * n) {

            answer[i][j] = num++

            when (direction) {
                "right" -> {
                    if (j + 1 < n && answer[i][j + 1] == 0) {
                        j += 1
                    } else {
                        direction = "down"
                        i += 1
                    }
                }

                "down" -> {
                    if (i + 1 < n && answer[i + 1][j] == 0) {
                        i += 1
                    } else {
                        direction = "left"
                        j -= 1
                    }
                }

                "left" -> {
                    if (j - 1 >= 0 && answer[i][j - 1] == 0) {
                        j -= 1
                    } else {
                        direction = "up"
                        i -= 1
                    }
                }

                else -> {
                    if (i - 1 >= 0 && answer[i - 1][j] == 0) {
                        i -= 1
                    } else {
                        direction = "right"
                        j += 1
                    }
                }
            }
        }

        return answer
    }
}