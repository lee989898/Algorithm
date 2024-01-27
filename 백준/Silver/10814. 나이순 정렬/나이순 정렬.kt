fun main() {
    val n = readln().toInt()
    val arrayList = ArrayList<Pair<Int, String>>()

    repeat(n) {
        val (a, b) = readln().split(" ")
        arrayList.add(a.toInt() to b)
    }

    arrayList.sortBy { it.first }

    print(arrayList.joinToString("\n") { "${it.first} ${it.second}" })
}
