import java.util.LinkedList
import java.util.Queue

fun main() {
    val queue: Queue<Int> = LinkedList()
    val (n, k) = readln().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()

    (1..n).forEach { queue.offer(it) }

    while (queue.isNotEmpty()) {
        repeat(k - 1) {
            queue.offer(queue.poll())
        }

        list.add(queue.poll())
    }

    print(list.joinToString(separator = ", ", prefix = "<", postfix = ">"))
}
