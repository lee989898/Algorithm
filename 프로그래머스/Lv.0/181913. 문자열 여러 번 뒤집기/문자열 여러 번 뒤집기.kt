class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string

        queries.forEach { (s, e) ->
            answer = answer.slice(0 until s) + answer.slice(s..e)
                .reversed() + answer.slice(e + 1..answer.lastIndex)
        }

        return answer
    }
}