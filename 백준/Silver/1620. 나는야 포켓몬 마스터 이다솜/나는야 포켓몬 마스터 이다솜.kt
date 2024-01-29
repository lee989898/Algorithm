import java.util.TreeMap

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    val names = TreeMap<String, Int>()
    val numbers = TreeMap<Int, String>()

    repeat(n) {
        val name = readln()
        names[name] = it + 1
        numbers[it + 1] = name
    }

    repeat(m) {
        val input = readln()

        if (names[input] != null) {
            sb.append("${names[input]}\n")
        } else {
            sb.append("${numbers[input.toInt()]}\n")
        }
    }

    print(sb)
}