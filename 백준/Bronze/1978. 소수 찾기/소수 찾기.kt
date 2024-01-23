fun main() {
    val n = readln().toInt()
    print(readln().split(" ").map { it.toInt() }.count { isPrime(it) })
}

fun isPrime(number: Int) = (1..number).count { number % it == 0 } == 2
