fun main() {
    val s = readln()
    val set = HashSet<String>()

    for (i in s.indices) {
        for (j in s.indices) {
            val slice = s.slice(i..j)

            if (slice.isNotBlank()) {
                set.add(slice)
            }
        }
    }

    print(set.size)
}
