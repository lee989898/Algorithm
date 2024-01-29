import kotlin.math.sqrt

fun main() {
    val sb = StringBuilder()
    val prime = BooleanArray(246913) { true }

    prime[1] = false

    for (i in 2..sqrt(246912.0).toInt()) {
        if (prime[i]) {
            for (j in i * 2..246912 step i) {
                prime[j] = false
            }
        }
    }

    while (true) {
        val input = readln().toInt()

        if (input == 0) break

        sb.append("${(input + 1..input * 2).count { prime[it] }}\n")
    }

    print(sb)
}
