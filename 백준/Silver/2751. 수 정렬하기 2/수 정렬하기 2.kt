import java.util.TreeSet

fun main() {
    val n = readln().toInt()
    val tresSet = TreeSet<Int>()

    repeat(n) {
        tresSet.add(readln().toInt())
    }

    print(tresSet.joinToString("\n"))
}
