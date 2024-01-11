fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ")
    val v = readln()

    print(numbers.count { it == v })
}