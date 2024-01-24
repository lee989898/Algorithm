fun main() {
    val (x, y, w, h) = readln().split(" ").map { it.toInt() }

    print(minOf(x, y, w - x, h - y))
}