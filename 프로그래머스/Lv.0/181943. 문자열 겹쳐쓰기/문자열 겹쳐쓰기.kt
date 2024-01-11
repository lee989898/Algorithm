class Solution {
    fun solution(myString: String, overwriteString: String, s: Int) =
        myString.replaceRange(s, s + overwriteString.length, overwriteString)
}