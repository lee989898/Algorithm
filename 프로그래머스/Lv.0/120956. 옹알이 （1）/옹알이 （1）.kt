class Solution {
    fun solution(babbling: Array<String>) = babbling.map {
        it.replace("aya|ye|woo|ma".toRegex(), "")
    }.count { it == "" }
}
