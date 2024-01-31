import java.util.Stack

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val stack = Stack<Char>()
        val input = readln()

        for (char in input) {
            if (char == '(') {
                stack.push('(')
            } else if (stack.isNotEmpty() && stack.peek() == '(' && char == ')') {
                stack.pop()
            } else {
                stack.push(')')
            }
        }

        if (stack.size == 0) sb.append("YES\n") else sb.append("NO\n")
    }

    print(sb)
}
