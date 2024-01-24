fun main() {

    while (true) {
        val input = readln().split(" ").map { it.toInt() }.sorted()
        val set = input.toSet()

        if (input.all { it == 0 }) break

        when {
            input[2] >= input[1] + input[0] -> println("Invalid")
            set.size == 1 -> println("Equilateral")
            set.size == 2 -> println("Isosceles")
            set.size == 3 -> println("Scalene")
        }
    }
}