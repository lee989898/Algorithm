class Solution {
    fun solution(n: Int, control: String) = control.fold(n) { acc, i ->
        acc + when (i) {
            'w' -> 1
            's' -> -1
            'd' -> 10
            'a' -> -10
            else -> 0
        }
    }
}