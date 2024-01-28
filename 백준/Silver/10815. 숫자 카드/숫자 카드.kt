fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.sorted()
    val m = readln().toInt()
    val b = readln().split(" ").map { it.toInt() }

    print(b.map { if (a.binarySearch(it) >= 0) 1 else 0 }.joinToString(" "))
}
