class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        var operator = ""
        val string = my_string.split(" ")

        answer = string[0].toInt()

        for(i in 1 until string.size) {
            if (string[i] == "+") {
                operator = "+"
            } else if (string[i] == "-") {
                operator = "-"
            } else {
                if(operator == "+") {
                    answer += string[i].toInt()
                } else {
                    answer -= string[i].toInt()
                }
            }
        }

        return answer
    }
}