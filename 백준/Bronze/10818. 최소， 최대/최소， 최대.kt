fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    print("${numbers.min()} ${numbers.max()}")
}