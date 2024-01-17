fun main() {
    val t = readln().toInt()

    repeat(t) {
        val str = readln()
        println("${str.first()}${str.last()}")
    }
}