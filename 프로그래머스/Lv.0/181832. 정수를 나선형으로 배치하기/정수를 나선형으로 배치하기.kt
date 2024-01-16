class Solution {
    fun solution(n: Int): Array<IntArray> {
        val answer = Array(n) { IntArray(n) }
        var (i, j) = 0 to 0
        var num = 1
        var direction = DIRECTION.RIGHT

        while (num <= n * n) {
            answer[i][j] = num++

            when (direction) {
                DIRECTION.RIGHT -> {
                    if (j + 1 < n && answer[i][j + 1] == 0) {
                        j += 1
                    } else {
                        direction = DIRECTION.DOWN
                        i += 1
                    }
                }

                DIRECTION.DOWN -> {
                    if (i + 1 < n && answer[i + 1][j] == 0) {
                        i += 1
                    } else {
                        direction = DIRECTION.LEFT
                        j -= 1
                    }
                }

                DIRECTION.LEFT -> {
                    if (j - 1 >= 0 && answer[i][j - 1] == 0) {
                        j -= 1
                    } else {
                        direction = DIRECTION.UP
                        i -= 1
                    }
                }

                DIRECTION.UP -> {
                    if (i - 1 >= 0 && answer[i - 1][j] == 0) {
                        i -= 1
                    } else {
                        direction = DIRECTION.RIGHT
                        j += 1
                    }
                }
            }
        }

        return answer
    }
}

enum class DIRECTION {
    UP, DOWN, LEFT, RIGHT
}