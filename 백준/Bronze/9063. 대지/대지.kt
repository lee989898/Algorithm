import kotlin.math.max
import kotlin.math.min

fun main() {
    val n = readln().toInt()
    var (x1, y1) = -10001 to -10001
    var (x2, y2) = 10001 to 10001

    repeat(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        x1 = max(x, x1)
        y1 = max(y, y1)
        x2 = min(x, x2)
        y2 = min(y, y2)
    }

    print((x1 - x2) * (y1 - y2))
}