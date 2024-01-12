class Solution {
    fun solution(str_list: Array<String>) = if (!(str_list.contains("l") || str_list.contains("r"))) {
        emptyList()
    } else {
        val first = str_list.first { it == "l" || it == "r" }

        if (first == "l") {
            str_list.slice(0 until str_list.indexOf(first))
        } else {
            str_list.slice(str_list.indexOf(first) + 1..str_list.lastIndex)
        }
    }
}
