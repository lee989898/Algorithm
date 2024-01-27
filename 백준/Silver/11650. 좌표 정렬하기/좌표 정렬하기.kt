import java.util.*

data class Point(val x: Int, val y: Int) : Comparable<Point> {
    override fun compareTo(other: Point): Int {
        return if (x == other.x) y.compareTo(other.y) else x.compareTo(other.x)
    }
}

fun main() {
    val n = readln().toInt()
    val treeSet = TreeSet<Point>()

    repeat(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        treeSet.add(Point(x, y))
    }

    print(treeSet.map { "${it.x} ${it.y}" }.joinToString("\n"))
}
