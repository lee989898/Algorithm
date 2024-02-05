fun main() {
    val n = readln().toInt()
    var count1 = 0
    var count2 = 0
    val fibo = IntArray(41)
    fibo[1] = 1
    fibo[2] = 1

    fun fib(n: Int): Int {
        if (n == 1 || n == 2) {
            count1++
            return 1
        } else {
            return fib(n - 1) + fib(n - 2)
        }
    }

    fun fibonacci(n: Int): Int {
        for (i in 3..n) {
            count2++
            fibo[i] = fibo[i - 1] + fibo[i - 2]
        }

        return fibo[n]
    }

    fib(n)
    fibonacci(n)

    print("$count1 $count2")
}
