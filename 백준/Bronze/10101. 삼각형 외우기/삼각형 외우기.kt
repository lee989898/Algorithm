fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    when {
        a == 60 && b == 60 && c == 60 -> print("Equilateral")
        a + b + c == 180 && a != b && b != c && a != c -> print("Scalene")
        a + b + c != 180 -> print("Error")
        else -> print("Isosceles")
    }
}