class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        var temp = ""

        (my_string.indices).forEach {
            if (my_string[it] == ' ') {
                if (temp.isNotEmpty()) {
                    answer += temp
                }
                temp = ""
            } else {
                temp += my_string[it]
            }
        }

        if (temp.isNotEmpty()) {
            answer += temp
        }

        return answer
    }
}