fun main() {
    val n = readln().toInt()
    var result = 0

    for (i in 1..n) {
        if (i + i.toString().sumOf { it.digitToInt() } == n) {
            result = i
            break
        }
    }

    print(result)
}