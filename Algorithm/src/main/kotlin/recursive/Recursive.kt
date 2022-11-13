package recursive

class Recursive

fun main() {
    Recursive1().recursiveFunction()
    Recursive2().recursiveFunction100(1)
    println(Recursive3().factorialIterative(5))
    print(Recursive3().factorialRecursive(5))
    print(Recursive4().gcd(192, 162))
}
