import java.util.ArrayDeque

fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    val deque = ArrayDeque((1..n).map { Pair(it, arr[it - 1]) })

    while (true) {
        val current = arr[deque.peek().first - 1]
        sb.append("${deque.pop().first} ")

        if (deque.isEmpty()) break

        if (current > 0) {
            repeat(current - 1) {
                deque.offerLast(deque.pollFirst())
            }
        } else {
            repeat(current.unaryMinus()) {
                deque.offerFirst(deque.pollLast())
            }
        }
    }

    print(sb)
}
