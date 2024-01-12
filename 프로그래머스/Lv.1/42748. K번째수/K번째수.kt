class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>) =
        commands.map { (i, j, k) -> array.sliceArray(i - 1 until j).sorted()[k - 1] }
}