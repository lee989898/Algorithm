import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var (a, b, v) = br.readLine().split(" ").map { it.toInt() }
    v -= b
    var count = 0

    if (v % (a - b) != 0) {
        count += v / (a - b)
        count += 1
    } else {
        count += v / (a - b)
    }

    bw.write("$count")

    bw.flush()
    bw.close()
    br.close()
}
