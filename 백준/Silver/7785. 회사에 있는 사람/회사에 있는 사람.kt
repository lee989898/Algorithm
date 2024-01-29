import java.util.TreeMap

fun main() {
    val n = readln().toInt()
    val map = TreeMap<String, String>(reverseOrder())

    repeat(n) {
        val (name, log) = readln().split(" ")
        map[name] = log
    }

    print(map.filter { it.value == "enter" }.map { it.key }.joinToString("\n"))
}