fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }

    val set = setOf(a, b, c)

    when (set.size) {
        1 -> print("${10_000 + set.max() * 1_000}")
        3 -> print("${set.max() * 100}")
        else -> {
            when {
                a == b -> print(1_000 + a * 100)
                b == c -> print(1_000 + b * 100)
                c == a -> print(1_000 + c * 100)
            }
        }
    }
}
