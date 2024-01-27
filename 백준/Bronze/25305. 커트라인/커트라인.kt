fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val x = readln().split(" ").map { it.toInt() }

    print(x.sortedDescending()[k - 1])
}
