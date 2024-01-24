fun main() {
    val numbers = readln().split(" ").map { it.toInt() }.sorted()
    var max = numbers[2]

    while (numbers[0] + numbers[1] <= max) {
        max--
    }

    print(numbers[0] + numbers[1] + max)
}