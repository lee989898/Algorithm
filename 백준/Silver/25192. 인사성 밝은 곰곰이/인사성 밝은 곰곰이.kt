fun main() {
    val n = readln().toInt()
    val set = HashSet<String>()
    var result = 0

    repeat(n) {
        val input = readln()

        if (input == "ENTER") {
            result += set.size
            set.clear()
        } else {
            set.add(input)
        }
    }

    if (set.size != 0) result += set.size

    print(result)
}
