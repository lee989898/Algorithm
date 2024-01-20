fun main() {
    var sum = 0.0
    var total = 0.0

    repeat(20) {
        val input = readln().split(" ")

        sum += input[1].toDouble()
        total += input[1].toDouble() * when(input[2]) {
            "A+" -> 4.5
            "A0" -> 4.0
            "B+" -> 3.5
            "B0" -> 3.0
            "C+" -> 2.5
            "C0" -> 2.0
            "D+" -> 1.5
            "D0" -> 1.0
            "F" -> 0.0
            else -> {
                sum -= input[1].toDouble()
                0.0
            }
        }
    }

    print(total / sum)
}