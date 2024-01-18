fun main() {
    val chess = listOf(1, 1, 2, 2, 2, 8)
    val input = readln().split(" ").map { it.toInt() }

    print(chess.mapIndexed { index, i -> i - input[index] }.joinToString(" "))
}