fun main() {
    val n = readln().toInt()
    val map = HashMap<String, Boolean>()

    repeat(n) {
        val input = readln().split(" ")

        if (map[input[0]] == true || map[input[1]] == true) {
            map[input[0]] = true
            map[input[1]] = true
        } else if (input[0] == "ChongChong" || input[1] == "ChongChong") {
            map[input[0]] = true
            map[input[1]] = true
        } else {
            map[input[0]] = false
            map[input[1]] = false
        }
    }

    print(map.count { it.value })
}
