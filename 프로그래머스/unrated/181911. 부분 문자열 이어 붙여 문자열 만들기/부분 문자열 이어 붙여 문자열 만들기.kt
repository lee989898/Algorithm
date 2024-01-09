class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>) =
        my_strings.mapIndexed { index, value -> value.slice(parts[index][0]..parts[index][1]) }.joinToString("")
}