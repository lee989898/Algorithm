import java.util.Stack

fun main() {
    val stack = Stack<Int>()
    val k = readln().toInt()

    repeat(k) {
        when (val input = readln().toInt()) {
            0 -> stack.pop()
            else -> stack.push(input)
        }
    }

    print(stack.sum())
}
