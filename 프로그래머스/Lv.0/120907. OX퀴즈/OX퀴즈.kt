class Solution {
    fun solution(quiz: Array<String>) = quiz.map {
        val q = it.split(" ")

        if (q[1] == "-") {
            if (q[0].toInt() - q[2].toInt() == q[4].toInt()) "O" else "X"
        } else {
            if (q[0].toInt() + q[2].toInt() == q[4].toInt()) "O" else "X"
        }
    }
}