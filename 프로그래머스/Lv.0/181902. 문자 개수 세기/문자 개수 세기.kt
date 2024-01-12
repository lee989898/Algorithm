class Solution {
    fun solution(my_string: String): IntArray {
        val alphabet = IntArray(52)

        my_string.forEach {
            if (it.isUpperCase()) {
                alphabet[it - 'A']++
            } else {
                alphabet[it - 'a' + 26]++
            }
        }

        return alphabet
    }
}