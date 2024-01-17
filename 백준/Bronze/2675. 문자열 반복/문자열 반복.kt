fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (r, s) = readln().split(" ")

        println(s.map { it.toString().repeat(r.toInt()) }.joinToString(""))
    }
}