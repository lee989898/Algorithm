class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        picture.forEach { p ->
            repeat(k) { number ->
                answer += p.map { "$it".repeat(k) }.joinToString("")
            }
        }

        return answer
    }
}