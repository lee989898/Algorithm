fun main() {
    val arr = Array(5) { CharArray(15) }

    for (i in 0..<5) {
        val str = readln().toCharArray()

        for (j in str.indices) {
            arr[i][j] = str[j]
        }
    }

    for (i in 0..<15) {
        for (j in 0..<5) {
            if (arr[j][i] != '\u0000') {
                print(arr[j][i])
            }
        }
    }
}