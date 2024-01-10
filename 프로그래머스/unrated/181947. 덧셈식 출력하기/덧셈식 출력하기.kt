fun main(args: Array<String>) {
    val (a, b) = readln().split(' ').map(String::toInt)
    print("$a + $b = ${a + b}")
}