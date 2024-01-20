fun main() {
    val n = readln().toInt()
    var count = n

    repeat(n) {
        val alphabet = BooleanArray(26)
        val str = readln()
        var prev = ' '
        var index = 0

        while (index < str.length) {

            if (prev == str[index]) {
                index++
                continue
            }

            if (!alphabet[str[index] - 'a']) {
                alphabet[str[index] - 'a'] = true
            } else {
                count--
                break
            }

            prev = str[index]
            index++
        }
    }

    print(count)
}