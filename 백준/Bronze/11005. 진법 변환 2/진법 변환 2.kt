fun main() {
    var (n, b) = readln().split(" ").map { it.toInt() }
    var result = ""

    while (n > 0) {
        if (n % b in 0..9) {
            result += n % b
        } else {
            result += (n % b + 55).toChar()
        }

        n /= b
    }

    print(result.reversed())
}