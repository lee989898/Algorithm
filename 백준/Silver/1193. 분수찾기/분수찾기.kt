fun main() {
    val x = readln().toInt()
    var count = 0
    var x1 = 0
    var y1 = 0

    for (i in 1..10_000_000) {
        var i1 = i
        if (i % 2 == 0) {
            for (j in 1..i) {
                x1 = j
                y1 = i1--
                count++

                if (count == x) {
                    print("$x1/$y1")
                    return
                }
            }
        } else {
            for (j in 1..i) {
                x1 = i1--
                y1 = j
                count++

                if (count == x) {
                    print("$x1/$y1")
                    return
                }
            }
        }
    }
}
