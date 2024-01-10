class Solution {
    fun solution(binomial: String) = binomial.split(" ").let {
        when (it[1]) {
            "+" -> it[0].toInt() + it[2].toInt()
            "-" -> it[0].toInt() - it[2].toInt()
            "*" -> it[0].toInt() * it[2].toInt()
            else -> throw IllegalArgumentException()
        }
    }
}