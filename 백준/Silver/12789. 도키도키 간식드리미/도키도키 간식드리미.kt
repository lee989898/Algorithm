import java.util.LinkedList
import java.util.Queue
import java.util.Stack

fun main() {
    val n = readln().toInt()
    var current = 1
    val lines = readln().split(" ").map { it.toInt() }

    val queue: Queue<Int> = LinkedList()
    val stack: Stack<Int> = Stack()

    lines.forEach { queue.offer(it) }

    while (true) {
        if (queue.isNotEmpty()) {
            if (queue.peek() == current) {
                queue.poll()
                current++
            } else if (stack.isNotEmpty() && stack.peek() == current) {
                stack.pop()
                current++
            } else {
                stack.push(queue.poll())
            }
        } else {
            if (stack.isNotEmpty() && stack.peek() == current) {
                stack.pop()
                current++
            } else {
                break
            }
        }
    }

    if (queue.isEmpty() && stack.isEmpty()) print("Nice") else print("Sad")
}
