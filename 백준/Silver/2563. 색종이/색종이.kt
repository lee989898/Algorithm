fun main() {
    val n = readln().toInt()
    val arr = Array(100) { IntArray(100) }
    var count = 0

    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toInt() - 1 }

        for (i in a..<a + 10) {
            for (j in b..<b + 10) {
                arr[i][j] = 1
            }
        }
    }

    for (i in arr.indices) {
        for (j in arr[i].indices) {
            if (arr[i][j] == 1) count++
        }
    }

    print(count)
}