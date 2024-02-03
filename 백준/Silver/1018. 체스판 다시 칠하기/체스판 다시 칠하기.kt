fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val chess = Array(n) { readln().toCharArray() }
    var result = Int.MAX_VALUE

    fun countWBoard(
        x: Int,
        y: Int,
    ): Int {
        var count = 0

        for (i in x..<x + 8) {
            for (j in y..<y + 8) {
                when {
                    i % 2 == 0 && j % 2 == 0 && chess[i][j] != 'W' -> count++
                    i % 2 == 0 && j % 2 != 0 && chess[i][j] != 'B' -> count++
                    i % 2 != 0 && j % 2 != 0 && chess[i][j] != 'W' -> count++
                    i % 2 != 0 && j % 2 == 0 && chess[i][j] != 'B' -> count++
                }
            }
        }

        return count
    }

    fun countBBoard(
        x: Int,
        y: Int,
    ): Int {
        var count = 0

        for (i in x..<x + 8) {
            for (j in y..<y + 8) {
                when {
                    i % 2 == 0 && j % 2 == 0 && chess[i][j] != 'B' -> count++
                    i % 2 == 0 && j % 2 != 0 && chess[i][j] != 'W' -> count++
                    i % 2 != 0 && j % 2 != 0 && chess[i][j] != 'B' -> count++
                    i % 2 != 0 && j % 2 == 0 && chess[i][j] != 'W' -> count++
                }
            }
        }

        return count
    }

    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            result = minOf(result, countWBoard(i, j), countBBoard(i, j))
        }
    }

    print("$result")
}
