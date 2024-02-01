import kotlin.math.round

fun main() {
    val n = readln().toInt()
    val arr = IntArray(n)
    val modes = HashMap<Int, Int>()

    repeat(n) {
        val input = readln().toInt()
        arr[it] = input
        modes[input] = modes.getOrDefault(input, 0) + 1
    }

    arr.sort()
    val max = modes.maxOf { it.value }
    val mode = modes.filter { it.value == max }.map { it.key }.sorted()

    println(round(arr.average()).toInt())
    println(arr[arr.size / 2])
    println(if (mode.size == 1) mode[0] else mode[1])
    println(arr.max() - arr.min())
}
