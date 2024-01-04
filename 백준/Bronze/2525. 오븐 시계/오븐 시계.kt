fun main() {
    val (h, m) = readln().split(" ").map { it.toInt() }
    val cookTime = readln().toInt()

    val total = h * 60 + m + cookTime
    val hour = total / 60
    val minute = total % 60

    print("${if (hour >= 24) hour - 24 else hour} $minute")
}
