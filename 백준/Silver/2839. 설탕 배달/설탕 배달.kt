import kotlin.math.min

fun main() {
    val n = readln().toInt()
    val dp = IntArray(5001) { Int.MAX_VALUE }

    dp[3] = 1
    dp[5] = 1

    for (i in 6..n) {
        if (dp[i - 3] != Int.MAX_VALUE || dp[i - 5] != Int.MAX_VALUE) {
            dp[i] = min(dp[i - 3], dp[i - 5]) + 1
        }
    }

    if (dp[n] == Int.MAX_VALUE) print(-1) else print(dp[n])
}
