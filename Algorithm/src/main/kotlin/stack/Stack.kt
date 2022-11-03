
package stack

import stack.Stack.stack
import java.util.Stack

object Stack {
    val stack = Stack<Int>()
}

fun main() {
    val s = stack

    // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
    s.push(5)
    s.push(2)
    s.push(3)
    s.push(7)
    s.pop()
    s.push(1)
    s.push(4)
    s.pop()
    // 스택의 최상단 원소부터 출력
    while (!s.empty()) {
        print("${s.peek()} ")
        s.pop()
    }
}
