class Solution {
    fun solution(price: Int) = when (price) {
        in 10 until 100_000 -> price
        in 100_000 until 300_000 -> price * 0.95
        in 300_000 until 500_000 -> price * 0.90
        else -> price * 0.80
    }.toInt()
}