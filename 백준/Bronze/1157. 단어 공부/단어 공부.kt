fun main() {
    val str = readln()
    val alphabet = IntArray(26)

    str.forEach {
        if (it.isLowerCase()) {
            alphabet[it - 'a']++
        } else {
            alphabet[it - 'A']++
        }
    }

    val max = alphabet.max()

    if (alphabet.indexOf(max) == alphabet.lastIndexOf(max)) {
        print(('A' + alphabet.indexOf(alphabet.max())))
    } else {
        print("?")
    }
}