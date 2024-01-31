fun main() {
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }

    val y = y1 * y2 / gcd(y1, y2)
    val x = x1 * (y / y1) + x2 * (y / y2)
    val gcd = gcd(x, y)

    print("${x / gcd} ${y / gcd}")
}

tailrec fun gcd(
    a: Int,
    b: Int,
): Int {
    return if (a % b == 0) b else gcd(b, a % b)
}
