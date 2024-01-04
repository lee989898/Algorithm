class Solution {
    fun solution(t: String, p: String) = (0..t.length - p.length).count {
        t.slice(it until it + p.length) <= p
    }
}