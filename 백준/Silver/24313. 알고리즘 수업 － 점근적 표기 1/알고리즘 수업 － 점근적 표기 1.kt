fun main() {
    val (a1, a0) = readln().split(" ").map { it.toInt() }
    val c = readln().toInt()
    var n0 = readln().toInt()

    var result = true

    while (n0 <= 100) {
        if (a1 * n0 + a0 > c * n0) {
            result = false
            break
        }

        n0++
    }

    if (result) {
        print(1)
    } else {
        print(0)
    }
}