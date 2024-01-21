fun main() {
    val t = readln().toInt()

    repeat(t) {
        val money = readln().toInt()

        println("${money / 25} ${money % 25 / 10} ${money % 25 % 10 / 5} ${money % 25 % 10 % 5 / 1}")
    }
}