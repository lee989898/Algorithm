class Solution {
    fun solution(cipher: String, code: Int) = cipher.filterIndexed { index, value -> (index + 1) % code == 0 }
}