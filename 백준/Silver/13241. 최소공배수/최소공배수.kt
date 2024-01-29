fun main() {
    val (a, b) = readln().split(" ").map { it.toLong() }
    print(a * b / gcd(a, b))
}

tailrec fun gcd(
    a: Long,
    b: Long,
): Long {
    return if (a % b == 0L) b else gcd(b, a % b)
}
