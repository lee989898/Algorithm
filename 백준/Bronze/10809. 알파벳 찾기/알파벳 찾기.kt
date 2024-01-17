fun main() {
    val alphabet = IntArray(26) { -1 }
    val str = readln()
    var count = 0

    str.forEach {
        if (alphabet[it -'a'] == -1) {
            alphabet[it - 'a'] = count
        }
        count++
    }

    print(alphabet.joinToString(" "))
}