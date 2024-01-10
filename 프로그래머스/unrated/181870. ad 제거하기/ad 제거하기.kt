class Solution {
    fun solution(strArr: Array<String>) = strArr.filterNot { "ad" in it }
}