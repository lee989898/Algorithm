fun main() {
    val x = readln().toInt()
    val n = readln().toInt()
    var total = 0

    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        total += a * b
    }

    when {
        x == total -> print("Yes")
        x != total -> print("No")
    }
}