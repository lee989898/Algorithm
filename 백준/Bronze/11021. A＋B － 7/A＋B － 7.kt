import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) { testcase ->
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        bw.write("Case #${testcase + 1}: ${a + b}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}