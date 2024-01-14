class Solution {
    fun solution(common: IntArray): Int {
        val map = common.mapIndexed { index, i ->
            if (index == 0) {
                i
            } else {
                common[index] - common[index - 1]
            }
        }

        return if (map[1] == map[2]) {
            common.last() + map[1]
        } else {
            common.last() * (map[2] / map[1])
        }
    }
}