fun main() {
    val n = readln().toInt()
    print((1..n).fold(1) { acc, i -> acc * i })
}
