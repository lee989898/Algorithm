
package queue

import java.util.LinkedList
import java.util.Queue

object Queue {
    val queue: Queue<Int> = LinkedList()
}

fun main() {
    val q = queue.Queue.queue

    // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
    q.offer(5)
    q.offer(2)
    q.offer(3)
    q.offer(7)
    q.poll()
    q.offer(1)
    q.offer(4)
    q.poll()
    // 먼저 들어온 원소부터 추출
    while (!q.isEmpty()) {
        print("${q.poll()} ")
    }
}
