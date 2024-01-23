fun main() {

    while (true) {
        val number = readln().toInt()

        if (number == -1) break

        val measure = (1..<number).filter { number % it == 0 }

        if(measure.sum() == number) {
            println("$number = ${measure.joinToString(" + ")}")
        } else {
            println("$number is NOT perfect.")
        }
    }
}