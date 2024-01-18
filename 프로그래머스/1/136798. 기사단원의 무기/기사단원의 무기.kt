import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0

        (1..number).forEach {
            val measure = measure(it)

            answer += if (measure <= limit) measure else power
        }

        return answer
    }

    private fun measure(number: Int): Int {
        var count = 0
        var i = 0
        
        while (true) {
            i++
            
            if (i * i >= number) break
            
            if (number % i == 0) count += 2
        }
        
        if (i * i == number) count++
        
        return count
    }
}