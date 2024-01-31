import java.util.Deque
import java.util.LinkedList

fun main() {
    val n = readln().toInt()
    val deque: Deque<Int> = LinkedList()
    val sb = StringBuilder()

    repeat(n) {
        val input = readln()

        when (input[0]) {
            '1' -> deque.offerFirst(input.split(" ")[1].toInt())
            '2' -> deque.offerLast(input.split(" ")[1].toInt())
            '3' -> if (deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.pollFirst()}\n")
            '4' -> if (deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.pollLast()}\n")
            '5' -> sb.append("${deque.size}\n")
            '6' -> if (deque.isEmpty()) sb.append("1\n") else sb.append("0\n")
            '7' -> if (deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.peekFirst()}\n")
            '8' -> if (deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.peekLast()}\n")
        }
    }

    print(sb)
}
