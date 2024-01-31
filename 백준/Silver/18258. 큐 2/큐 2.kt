import java.util.*

fun main() {
    val queue: Deque<Int> = LinkedList()
    val n = readln().toInt()
    val sb = StringBuilder()

    repeat(n) {
        when (val input = readln()) {
            "pop" -> if (queue.isEmpty()) sb.append("-1\n") else sb.append("${queue.poll()}\n")
            "size" -> sb.append("${queue.size}\n")
            "empty" -> if (queue.isEmpty()) sb.append("1\n") else sb.append("0\n")
            "front" -> if (queue.isEmpty()) sb.append("-1\n") else sb.append("${queue.peek()}\n")
            "back" -> if (queue.isEmpty()) sb.append("-1\n") else sb.append("${queue.peekLast()}\n")
            else -> queue.offer(input.split(" ")[1].toInt())
        }
    }

    print(sb)
}
