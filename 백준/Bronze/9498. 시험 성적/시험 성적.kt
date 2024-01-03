fun main() {
    val score = readln().toInt()

    when(score) {
        in 90..100 -> print("A")
        in 80..<90 -> print("B")
        in 70..<80 -> print("C")
        in 60..<70 -> print("D")
        else -> print("F")
    }
}