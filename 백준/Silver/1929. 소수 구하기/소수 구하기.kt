import kotlin.math.sqrt

fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    val primes = BooleanArray(n + 1) { true }
    primes[1] = false

    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (primes[i]) {
            for (j in i * 2..n step i) {
                primes[j] = false
            }
        }
    }

    for (i in m..n) {
        if (primes[i]) sb.append("$i\n")
    }

    print(sb)
}
