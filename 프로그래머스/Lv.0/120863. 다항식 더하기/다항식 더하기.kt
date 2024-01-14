class Solution {
    fun solution(polynomial: String): String {
        var x = 0
        var y = 0

        polynomial.split(" ").forEach {
            if (it.contains("x")) {
                if (it == "x") x += 1
                else x += it.replace("x", "").toInt()
            } else if (it != "+") y += it.toInt()
        }

        return if (x != 0 && y == 0) {
            if (x == 1) "x"
            else "${x}x"
        } else if (x == 0 && y != 0) {
            "$y"
        } else {
            if (x == 1) "x + $y"
            else "${x}x + $y"
        }
    }
}