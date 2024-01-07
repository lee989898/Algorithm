class Solution {
    fun solution(sides: IntArray) = sides.sorted().let { if (it[0] + it[1] > it[2]) 1 else 2 }
}