fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    try {
        print((1..n).filter { n % it == 0 }[k - 1])
    } catch (e: IndexOutOfBoundsException) {
        print(0)
    }
}