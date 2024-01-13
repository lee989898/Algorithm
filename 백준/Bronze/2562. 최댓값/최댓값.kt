fun main() {
    val arr = ArrayList<Int>()

    repeat(9) {
        arr.add(readln().toInt())
    }

    val max = arr.max()

    println(max)
    print(arr.indexOf(max) + 1)
}