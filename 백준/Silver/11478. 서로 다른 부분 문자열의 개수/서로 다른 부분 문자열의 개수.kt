fun main() {
    val s = readln()
    val set = HashSet<String>()

    for (i in 0..s.length) {
        for (j in i + 1..s.length) {
            set.add(s.substring(i..<j))
        }
    }

    print(set.size)
}
