fun main() {
    val arr = Array(9) { readln().split(" ").map { it.toInt() } }
    var max = 0
    var (a, b) = 0 to 0

    for (i in 0..<9) {
        for (j in 0..<9) {
            if (max <= arr[i][j]) {
                max = arr[i][j]
                a = i + 1
                b = j + 1
            }
        }
    }

    println(max)
    print("$a $b")
}