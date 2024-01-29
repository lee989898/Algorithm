import kotlin.math.sqrt

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        var input = readln().toLong()

        if (input in 0..1) {
            sb.append("2\n")
        } else {
            while (true) {
                if (isPrime(input)) {
                    sb.append("$input\n")
                    break
                }

                input++
            }
        }
    }

    print(sb)
}

fun isPrime(number: Long): Boolean {
    for (i in 2..sqrt(number.toDouble()).toLong()) {
        if (number % i == 0L) return false
    }

    return true
}
