import kotlin.math.sqrt

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        val prime = BooleanArray(3001) { true }
        prime[1] = false

        for (i in 2..sqrt(3000.toDouble()).toInt()) {
            if (prime[i]) {
                for (j in i * 2..3000 step i) {
                    prime[j] = false
                }
            }
        }

        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                for (k in j + 1 until nums.size) {
                    if (prime[nums[i] + nums[j] + nums[k]]) {
                        answer += 1
                    }
                }
            }
        }

        return answer
    }
}