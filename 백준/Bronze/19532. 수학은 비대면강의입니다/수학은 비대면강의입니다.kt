fun main() {
    val input = readln().split(" ").map { it.toInt() }

    for (i in -999..999) {
        for (j in -999..999) {
            if (input[0] * i + input[1] * j == input[2] && input[3] * i + input[4] * j == input[5]) {
                print("$i $j")
                break
            }
        }
    }
}