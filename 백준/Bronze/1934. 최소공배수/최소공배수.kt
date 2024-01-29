fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        sb.append("${a * b / gcd(a, b)}\n")
    }

    print(sb)
}

fun gcd(
    a: Int,
    b: Int,
): Int {
    return if (a % b == 0) b else gcd(b, a % b)
}
