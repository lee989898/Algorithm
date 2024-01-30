import kotlin.math.sqrt

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()
    val prime = BooleanArray(1_000_001) { true }

    for (i in 2..sqrt(1_000_000.0).toInt()) {
        if (prime[i]) {
            for (j in i * 2..1_000_000 step i) {
                prime[j] = false
            }
        }
    }

    prime[0] = false
    prime[1] = false

    repeat(t) {
        val n = readln().toInt()
        var count = 0

        for (i in 2..n / 2) {
            if (prime[i] && prime[n - i]) {
                count++
            }
        }

        sb.append("$count\n")
    }

    print(sb)
}
