fun main() {
    val n = readln().toInt()
    val fibo = IntArray(21)

    fibo[1] = 1

    for (i in 2..20) {
        fibo[i] = fibo[i - 1] + fibo[i - 2]
    }

    print(fibo[n])
}
