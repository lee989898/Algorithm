class Solution {
    fun solution(sides: IntArray) = sides.sorted().let { (a, b, c) -> if (a + b > c) 1 else 2 }
}