class Solution {
    fun solution(numbers: IntArray, direction: String) = if (direction == "right") {
             numbers.takeLast(1) + numbers.dropLast(1) 
        } else {
            numbers.drop(1) + numbers.take(1)
        }
}