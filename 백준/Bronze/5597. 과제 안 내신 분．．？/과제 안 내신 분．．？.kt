fun main() {
    val students = IntArray(31)

    repeat(28) {
        val student = readln().toInt()
        students[student]++
    }

    students.forEachIndexed { index, i -> if (i == 0 && index != 0) println(index) }
}