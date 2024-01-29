import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()
    val map = HashMap<Int, Int>()
    var st = StringTokenizer(readln())
    val sb = StringBuilder()

    while (st.hasMoreTokens()) {
        val input = st.nextToken().toInt()
        map[input] = map.getOrDefault(input, 0) + 1
    }

    val m = readln().toInt()
    st = StringTokenizer(readln())

    while (st.hasMoreTokens()) {
        sb.append("${map.getOrDefault(st.nextToken().toInt(), 0)} ")
    }

    print(sb)
}
