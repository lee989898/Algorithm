fun main() {
    val (a, b) = readln().split(" ")

    print(maxOf(a.reversed(), b.reversed()))
}