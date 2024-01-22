import kotlin.math.pow

fun main() {
    val n = readln().toDouble()
    var side = 2

    repeat(n.toInt()) {
        side += 2.0.pow(it).toInt()
    }

    print(side * side)
}