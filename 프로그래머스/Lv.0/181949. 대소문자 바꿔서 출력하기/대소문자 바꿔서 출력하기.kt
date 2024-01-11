fun main(args: Array<String>) {
    val s1 = readln()

    print(s1.map { if (it.isLowerCase()) it.uppercase() else it.lowercase() }.joinToString(""))
}