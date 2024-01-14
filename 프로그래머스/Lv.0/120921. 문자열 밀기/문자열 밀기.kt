class Solution {
    fun solution(A: String, B: String): Int {
        var answer = 0
        var copyA = A

        repeat(A.length) {
            if (copyA == B) return answer
            answer++
            copyA = copyA.takeLast(1) + copyA.dropLast(1)
        }

        return -1
    }
}
