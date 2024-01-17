fun main() {
    val str = readln()

    print(str.map {
        when(it) {
            in 'A'..'C' -> 3
            in 'D'..'F' -> 4
            in 'G'..'I' -> 5
            in 'J'..'L' -> 6
            in 'M'..'O' -> 7
            in 'P'..'S' -> 8
            in 'T'..'V' -> 9
            else -> 10
        }
    }.sum())
}