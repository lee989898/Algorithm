fun main() {
    val n = readln().toInt()
    var result = 2

    repeat(n - 1) {
        result *= 2
    }

    print(result)
}
