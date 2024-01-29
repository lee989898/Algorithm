import java.util.TreeSet

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val unListened = HashMap<String, Boolean>()
    var count = 0
    val treeSet = TreeSet<String>()

    repeat(n) {
        unListened[readln()] = true
    }

    repeat(m) {
        val input = readln()
        unListened[input]?.let {
            treeSet.add(input)
            count++
        }
    }

    println(count)
    print(treeSet.joinToString("\n"))
}
