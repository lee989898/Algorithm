import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        val stack = Stack<Int>()
        
        s.split(" ").forEach { 
            if (it == "Z") {
                stack.pop()
            } else {
                stack.push(it.toInt())
            }
        }
        
        return stack.sum()
    }
}