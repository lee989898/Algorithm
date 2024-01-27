fun main() {
    val numbers = ArrayList<Int>()

    repeat(5) {
        numbers.add(readln().toInt())
    }

    println(numbers.average().toInt())
    print(numbers.sorted()[2])
}
