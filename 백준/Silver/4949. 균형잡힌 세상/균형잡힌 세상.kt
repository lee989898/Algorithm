import java.util.Stack

fun main() {
    val sb = StringBuilder()

    while (true) {
        val input = readln()
        val stack = Stack<Char>()

        if (input == ".") break

        for (char in input) {
            if (char == '(') {
                stack.push('(')
            } else if (char == '[') {
                stack.push('[')
            } else if (char == ')' && stack.isNotEmpty() && stack.peek() == '(') {
                stack.pop()
            } else if (char == ')') {
                stack.push(')')
            } else if (char == ']' && stack.isNotEmpty() && stack.peek() == '[') {
                stack.pop()
            } else if (char == ']') {
                stack.push(']')
            }
        }

        if (stack.size == 0) sb.append("yes\n") else sb.append("no\n")
    }

    print(sb)
}
