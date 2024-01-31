fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    if (k == 0) {
        print(1)
    } else {
        val result = (n + 1 - k..n).fold(1) { acc, i -> acc * i } / (1..k).fold(1) { acc, i -> acc * i }
        print(result)
    }
}
