class Solution {
    fun solution(age: Int) = age.toString().map { (49 + it.toInt()).toChar() }.joinToString("")
}