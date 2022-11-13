package recursive

class Recursive3() {
    // 반복적으로 구현한 n!
    fun factorialIterative(n: Int): Int {
        var result = 1
        // 1부터 n까지의 수를 차례대로 곱하기
        for (i in 1..n)
            result *= i
        return result
    }

    // 재귀적으로 구현한 n!
    fun factorialRecursive(n: Int): Int {
        if (n <= 1) { // n이 1이하인 경우 1을 반환
            return 1
        }
        // n! = n * (n-1)! 를 그대로 코드로 작성하기
        return n * factorialRecursive(n - 1)
    }
}
