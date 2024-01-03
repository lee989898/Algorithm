class Solution {
    fun solution(left: Int, right: Int) = (left..right).sumOf { if(countMeasure(it) % 2 == 0) it else -it }

    private fun countMeasure(number: Int) = (1..number).count { number % it == 0 }
}