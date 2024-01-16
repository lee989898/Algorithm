fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    var basket = List(n) { it + 1 }

    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() - 1 }

        basket = basket.slice(0 until i) +
                basket.slice(i..j).reversed() +
                basket.slice(j + 1..basket.lastIndex)
    }

    print(basket.joinToString(" "))
}