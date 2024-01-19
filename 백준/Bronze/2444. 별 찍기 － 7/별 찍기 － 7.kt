fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        for (j in n - 1 downTo i) {
            print(" ")
        }
        for (j in 1..<i * 2) {
            print("*")
        }
        println()
    }

    for (i in n - 1 downTo 1) {
        for (j in i..<n) {
            print(" ")
        }
        for (j in 1..<i*2) {
            print("*")
        }
        println()
    }
}