import java.util.LinkedList
import java.util.Queue

fun main() {
    val n = readln().toInt()
    val queue: Queue<Int> = LinkedList()

    (1..n).forEach { queue.offer(it) }

    if (queue.size == 1) {
        print(queue.poll())
    } else {
        while (true) {
            queue.poll()

            if (queue.size == 1) break

            queue.offer(queue.poll())
        }

        print(queue.poll())
    }
}
