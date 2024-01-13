class Solution {
    fun solution(my_string: String, queries: Array<IntArray>) = queries.fold(my_string) { acc, (s, e) ->
        acc.slice(0 until s) + acc.slice(s..e).reversed() + acc.slice(e + 1..my_string.lastIndex)
    }
}