import java.util.TreeSet

fun main() {
    val n = readln().toInt()
    val treeSet = TreeSet<Int>()

    repeat(n) {
        treeSet.add(readln().toInt())
    }

    print(treeSet.joinToString("\n"))
}
