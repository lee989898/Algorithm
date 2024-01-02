class Solution {
    fun solution(phone_number: String) =
        phone_number.mapIndexed { index, char -> if (index < phone_number.length - 4) "*" else char }.joinToString("")
}