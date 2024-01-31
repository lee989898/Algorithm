import java.util.*

fun main() {
    val n = readln().toInt()
    val stack = Stack<Int>()
    val sb = StringBuilder()

    repeat(n) {
        val input = readln()

        when (input[0]) {
            '1' -> stack.push(input.split(" ")[1].toInt())
            '2' -> if (stack.isEmpty()) sb.append("${-1}\n") else sb.append("${stack.pop()}\n")
            '3' -> sb.append("${stack.size}\n")
            '4' -> if (stack.isEmpty()) sb.append("${1}\n") else sb.append("${0}\n")
            '5' -> if (stack.isEmpty()) sb.append("${-1}\n") else sb.append("${stack.peek()}\n")
        }
    }

    print(sb)
}
