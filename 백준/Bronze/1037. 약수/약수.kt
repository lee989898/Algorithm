fun main() {
    val n = readln().toInt()
    val input = readln().split(" ").map { it.toInt() }.sorted()

    print(input[0] * input[input.lastIndex])
}
