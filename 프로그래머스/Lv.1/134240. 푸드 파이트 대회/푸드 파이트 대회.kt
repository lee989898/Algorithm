class Solution {
    fun solution(food: IntArray) =
        (1..food.lastIndex).joinToString("") { "$it".repeat(food[it] / 2) } +
                "0" +
                (food.lastIndex downTo 1).joinToString("") { "$it".repeat(food[it] / 2) }
}