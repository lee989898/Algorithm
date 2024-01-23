fun main() {
    val n = readln().toInt()
    var count = 1
    var current = 1

    while (n > current) {
        current += 6 * count
        count++
    }

    print(count)
}