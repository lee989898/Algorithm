class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = 0
        var count = 1
        var cur = numbers[0]

        while (count != k) {
            count += 1
            
            answer += 2
            cur = numbers[answer % numbers.size]
        }
        
        return cur
    }
}