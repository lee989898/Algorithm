import java.util.Collections

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val basket = List(n + 1) { it }

    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() }
        Collections.swap(basket, i, j)
    }

    (1..n).forEach { print("${basket[it]} ") }
}