import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = br.readLine() ?: break

        bw.write("${input.split(" ").sumOf { it.toInt() }}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}
