fun main() {
    val m = readln().toInt()
    val scores = readln().split(" ").map { it.toInt() }
    val maxScore = scores.max().toDouble()

    print(scores.map { it / maxScore * 100 }.average())
}