fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    val combination =
        Array(31) { i ->
            LongArray(31) { j ->
                if (i == j || j == 0) {
                    1
                } else if (j == 1) {
                    i.toLong()
                } else {
                    0
                }
            }
        }

    for (i in 1..30) {
        for (j in 1..30) {
            if (i != j && j != 1) {
                if (combination[i][j] == 0L && i > j) {
                    combination[i][j] = combination[i - 1][j - 1] + combination[i - 1][j]
                }
            }
        }
    }

    repeat(t) {
        val (n, m) = readln().split(" ").map { it.toInt() }

        sb.append("${combination[m][n]}\n")
    }

    print(sb)
}
