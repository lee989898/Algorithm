class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray) =
        included.indices.sumOf { if (included[it]) a + (d * it) else 0 }
}