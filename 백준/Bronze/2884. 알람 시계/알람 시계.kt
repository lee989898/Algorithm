fun main() {
    val (h, m) = readln().split(" ").map { it.toInt() }

    if (m >= 45) {
        print("$h ${m - 45}")
    } else {
        print("${if (h == 0) 23 else h - 1} ${m + 15}")
    }
}
