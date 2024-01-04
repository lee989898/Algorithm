class Solution {
    fun solution(price: Int, money: Int, count: Int) =
        ((1.toLong()..count.toLong()).sumOf { price * it } - money).let { if (it > 0) it else 0 }
}