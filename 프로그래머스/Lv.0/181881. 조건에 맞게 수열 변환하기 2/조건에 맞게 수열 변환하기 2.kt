class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        var prev = arr.toList()

        while (true) {
            val cur =
                prev.map { if (it >= 50 && it % 2 == 0) it / 2 else if (it < 50 && it % 2 != 0) (it * 2) + 1 else it }

            if (cur == prev) break

            prev = cur
            
            answer++
        }

        return answer
    }
}
