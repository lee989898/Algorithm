import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val n = br.readLine() ?: break
        val str = "-".repeat(3.0.pow(n.toInt()).toInt())
        println(cantorSet(str))
    }

    br.close()
}

fun cantorSet(str: String): String {
    return if (str.length == 1 || str.isBlank()) {
        str
    } else {
        cantorSet("-".repeat(str.length / 3)) + cantorSet(" ".repeat(str.length / 3)) + cantorSet("-".repeat(str.length / 3))
    }
}
