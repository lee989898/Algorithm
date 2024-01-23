fun main() {
    var (a, b, v) = readln().split(" ").map { it.toInt() }
    v -= b

    if (v % (a - b) == 0) {
        print(v / (a - b))
    } else {
        print(v / (a - b) + 1)
    }
}