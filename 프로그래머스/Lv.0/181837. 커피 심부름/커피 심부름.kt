class Solution {
    fun solution(order: Array<String>) = order.sumOf {
        when (it) {
            "iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything" -> 4_500
            "icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte" -> 5_000
            else -> throw IllegalArgumentException()
        }.toInt()
    }
}