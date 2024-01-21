fun main() {
    val (n, b) = readln().split(" ")
    var result = 0
    var newB = 1

    repeat(n.length - 1) {
        newB *= b.toInt()
    }

    for (i in n.indices) {
        result += if (n[i].isDigit()) {
            n[i].digitToInt() * newB
        } else {
            (n[i] - 'A' + 10) * newB
        }

        newB /= b.toInt()
    }

    print(result)
}