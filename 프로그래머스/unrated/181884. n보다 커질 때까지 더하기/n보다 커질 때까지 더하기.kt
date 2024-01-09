class Solution {
    fun solution(numbers: IntArray, n: Int) = numbers.reduce { acc, value -> if (acc <= n) acc + value else acc }
}