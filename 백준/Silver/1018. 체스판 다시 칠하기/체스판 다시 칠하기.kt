import kotlin.math.min

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val chess = Array(n) { readln().toCharArray() }
    var result = Int.MAX_VALUE

    fun countBoard(
        x: Int,
        y: Int,
    ): Int {
        var count1 = 0
        var count2 = 0

        for (i in x..<x + 8) {
            for (j in y..<y + 8) {
                if (i % 2 == 0 && j % 2 == 0 && chess[i][j] != 'W') {
                    count1 += 1
                } else if (i % 2 == 0 && j % 2 != 0 && chess[i][j] != 'B') {
                    count1 += 1
                } else if (i % 2 != 0 && j % 2 != 0 && chess[i][j] != 'W') {
                    count1 += 1
                } else if (i % 2 != 0 && j % 2 == 0 && chess[i][j] != 'B') {
                    count1 += 1
                }
            }
        }

        for (i in x..<x + 8) {
            for (j in y..<y + 8) {
                if (i % 2 == 0 && j % 2 == 0 && chess[i][j] != 'B') {
                    count2 += 1
                } else if (i % 2 == 0 && j % 2 != 0 && chess[i][j] != 'W') {
                    count2 += 1
                } else if (i % 2 != 0 && j % 2 != 0 && chess[i][j] != 'B') {
                    count2 += 1
                } else if (i % 2 != 0 && j % 2 == 0 && chess[i][j] != 'W') {
                    count2 += 1
                }
            }
        }
        
        return min(count1, count2)
    }

    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            result = min(result, countBoard(i, j))
        }
    }

    print("$result")
}
