class Solution {
    fun solution(strArr: Array<String>) = strArr.groupBy { it.length }.maxOf { it.value.size }
}