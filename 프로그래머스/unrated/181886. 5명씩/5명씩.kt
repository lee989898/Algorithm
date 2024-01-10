class Solution {
    fun solution(names: Array<String>) = names.filterIndexed { index, _ -> index % 5 == 0 }
}