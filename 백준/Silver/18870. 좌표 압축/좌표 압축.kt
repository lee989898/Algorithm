import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    val input = br.readLine().split(" ").map { it.toInt() }

    val sorted = input.toSortedSet().toTypedArray()

    input.forEach { bw.write("${sorted.binarySearch(it)} ") }

    bw.flush()
    bw.close()
    br.close()
}
