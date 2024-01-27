fun main() {
    val n = readln().toInt()
    val numbers = ArrayList<Char>()

    for (char in n.toString()) {
        numbers.add(char)
    }

    print(numbers.sortedDescending().joinToString(""))
}
