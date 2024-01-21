fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = Array(n) { IntArray(m) }

    for (i in 0..<n) {
        val input = readln().split(" ").map { it.toInt() }

        for (j in 0..<m) {
            arr[i][j] += input[j]
        }
    }

    for (i in 0..<n) {
        val input = readln().split(" ").map { it.toInt() }

        for (j in 0..<m) {
            arr[i][j] += input[j]
        }
    }

    for (i in 0..<n) {
        println(arr[i].joinToString(" "))
    }
}