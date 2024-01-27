import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val arr = IntArray(10001)

    repeat(n) {
        arr[br.readLine().toInt()]++
    }

    for (i in arr.indices) {
        if (arr[i] != 0) {
            repeat(arr[i]) {
                bw.write("$i\n")
            }
        }
    }

    bw.flush()
    bw.close()
    br.close()
}
