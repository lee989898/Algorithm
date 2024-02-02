fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val input = readln()
        var count = 1

        fun recursion(
            s: String,
            l: Int,
            r: Int,
        ): Int {
            return if (l >= r) {
                1
            } else if (s[l] != s[r]) {
                0
            } else {
                count++
                recursion(s, l + 1, r - 1)
            }
        }

        fun isPalindrome(s: String): Int = recursion(s, 0, s.length - 1)

        sb.append("${isPalindrome(input)} ${count}\n")
    }

    print(sb)
}
