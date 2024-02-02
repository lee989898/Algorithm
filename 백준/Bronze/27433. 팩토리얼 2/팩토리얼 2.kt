fun main() {
    val n = readln().toLong()

    print(factorial(n))
}

fun factorial(n: Long): Long {
    if (n == 0L || n == 1L) return 1

    return n * factorial(n - 1)
}
