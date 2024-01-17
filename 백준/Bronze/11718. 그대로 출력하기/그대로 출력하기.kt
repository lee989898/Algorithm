import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = br.readLine()

        if (input == null) {
            break
        } else {
            println(input)
        }
    }

    br.close()
}