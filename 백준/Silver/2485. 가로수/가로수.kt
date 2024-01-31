fun main() {
    val n = readln().toInt()
    val arr = IntArray(n) { readln().toInt() }
    var gcd = arr[1] - arr[0]
    var result = 0

    for (i in 2 until arr.size) {
        gcd = gcd(gcd, arr[i] - arr[i - 1])
    }

    for (i in 0 until arr.size - 1) {
        result += (arr[i + 1] - arr[i]) / gcd - 1
    }

    print(result)
}

tailrec fun gcd(
    a: Int,
    b: Int,
): Int {
    return if (a % b == 0) b else gcd(b, a % b)
}
