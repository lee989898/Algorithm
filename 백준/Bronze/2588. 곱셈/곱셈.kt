fun main() {
    val a = readln().toInt()
    val b = readln()

    println(a * b[2].digitToInt())
    println(a * b[1].digitToInt())
    println(a * b[0].digitToInt())
    println(a * b.toInt())
}
