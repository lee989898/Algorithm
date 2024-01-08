class Solution {
    fun solution(a: Int, b: Int) = if ("$a$b" >= "$b$a") {
        "$a$b"
    } else {
        "$b$a"
    }.toInt()
}