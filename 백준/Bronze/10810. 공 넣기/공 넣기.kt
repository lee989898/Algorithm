fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val arr = IntArray(n + 1)

    repeat(m) {
        val (i, j, k) = readln().split(" ").map { it.toInt() }

        (i..j).forEach { arr[it] = k }
    }

    print(arr.sliceArray(1..arr.lastIndex).joinToString(" "))
}