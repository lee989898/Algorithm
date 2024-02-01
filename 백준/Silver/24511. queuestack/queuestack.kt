import java.util.Deque
import java.util.LinkedList

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val b = readln().split(" ").map { it.toInt() }.filterIndexed { index, i -> a[index] == 0 }
    val sb = StringBuilder()

    val deque: Deque<Int> = LinkedList()

    val m = readln().toInt()
    val c = readln().split(" ").map { it.toInt() }

    b.forEach { deque.offer(it) }
    c.forEach { deque.offerFirst(it) }

    repeat(m) {
        sb.append("${deque.pollLast()} ")
    }

    print(sb)
}
