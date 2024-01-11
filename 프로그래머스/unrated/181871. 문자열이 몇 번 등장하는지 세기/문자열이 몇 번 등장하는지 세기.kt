class Solution {
    fun solution(myString: String, pat: String) =
        (0..myString.length - pat.length).count { myString.slice(it until it + pat.length) == pat }
}