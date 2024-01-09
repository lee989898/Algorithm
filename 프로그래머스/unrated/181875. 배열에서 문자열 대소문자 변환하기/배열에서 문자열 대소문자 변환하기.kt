class Solution {
    fun solution(strArr: Array<String>) = strArr.mapIndexed { index, value ->
        if (index % 2 == 0) value.lowercase()
        else value.uppercase()
    }
}