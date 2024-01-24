fun main() {
    val x = IntArray(1001)
    val y = IntArray(1001)

    val (a1, b1) = readln().split(" ").map { it.toInt() }
    val (a2, b2) = readln().split(" ").map { it.toInt() }
    val (a3, b3) = readln().split(" ").map { it.toInt() }

    x[a1]++
    y[b1]++
    x[a2]++
    y[b2]++
    x[a3]++
    y[b3]++

    print("${x.indexOf(1)} ${y.indexOf(1)}")
}