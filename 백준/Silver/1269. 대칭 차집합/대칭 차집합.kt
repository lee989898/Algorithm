fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val a = readln().split(" ").toSet()
    val b = readln().split(" ").toSet()

    print(b.subtract(a).size + a.subtract(b).size)
}
