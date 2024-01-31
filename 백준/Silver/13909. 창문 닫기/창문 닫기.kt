fun main() {
    val n = readln().toInt()
    var current = 0L
    var count = 0

    while (current <= n) {
        current++

        if (current * current <= n) {
            count += 1
        }
    }

    print(count)
}
