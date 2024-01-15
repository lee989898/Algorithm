class Solution {
    fun solution(num: Int, total: Int): List<Int> {
        (-1000..1000).forEach {
            if ((it until it + num).sum() == total) {
                return (it until it + num).sorted()
            }
        }
        return listOf()
    }
}