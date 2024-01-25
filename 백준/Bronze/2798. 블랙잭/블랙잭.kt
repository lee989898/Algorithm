import kotlin.math.max

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val cards = readln().split(" ").map { it.toInt() }
    var max = 0

    for (i in 0..<cards.size) {
        for (j in i + 1 ..<cards.size) {
            for (k in j + 1..<cards.size) {
                val sum = cards[i] + cards[j] + cards[k]

                if (sum <= m) {
                    max = max(max, cards[i] + cards[j] + cards[k])
                }
            }
        }
    }

    print(max)
}