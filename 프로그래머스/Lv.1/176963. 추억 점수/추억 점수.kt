class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): List<Int> {
        val map = name.zip(yearning.toList()).toMap()
        return photo.map { p -> p.sumOf { map.getOrDefault(it, 0) } }
    }
}