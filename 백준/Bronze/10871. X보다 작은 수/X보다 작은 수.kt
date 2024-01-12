fun main() {
    val (n, x) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }

    a.filter { it < x }.forEach {
        print("$it ")
    }
}