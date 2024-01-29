fun main() {
    val n = readln().toInt()
    var count = 0
    var current = 666

    while (true) {
        if (current.toString().contains("666")) {
            count++
        }

        if (n == count) break

        current++
    }

    print(current)
}
