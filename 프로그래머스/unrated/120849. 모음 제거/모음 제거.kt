class Solution {
    fun solution(my_string: String) = my_string.filterNot { "aeiou".contains(it)  }
}