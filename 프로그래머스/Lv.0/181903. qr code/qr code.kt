class Solution {
    fun solution(q: Int, r: Int, code: String) = code.filterIndexed { index, _ -> index % q == r }
}