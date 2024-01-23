fun main() {
    var n = readln().toInt()
    val result = ArrayList<Int>()
    var prime = 2

    while (n != 1) {
        while (n % prime == 0) {
            result.add(prime)
            n /= prime
        }
        prime++
    }

    print(result.joinToString("\n"))
}