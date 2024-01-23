import kotlin.math.sqrt

fun main() {
    val m = readln().toInt()
    val n = readln().toInt()

    val isPrime = BooleanArray(10_001) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..sqrt(10000.0).toInt()) {

        if (isPrime[i]) {
            for (j in i*2..10000 step i) {
                isPrime[j] = false
            }
        }
    }

    val primes = (m..n).filter { isPrime[it] }

    if (primes.isEmpty()) {
        print(-1)
    } else {
        println(primes.sum())
        print(primes.min())
    }
}