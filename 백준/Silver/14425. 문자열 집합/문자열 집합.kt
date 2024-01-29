fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val set = HashSet<String>()
    var count = 0

    repeat(n) {
        set.add(readln())
    }

    repeat(m) {
        if (set.contains(readln())) count++
    }

    print(count)
}
