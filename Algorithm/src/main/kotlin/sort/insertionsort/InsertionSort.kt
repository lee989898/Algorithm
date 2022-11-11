package sort.insertionsort

fun main() {
    val n = 10
    val arr = mutableListOf(7, 5, 9, 0, 3, 1, 6, 2, 4, 8)

    for (i in 1 until n) {
        // 인덱스 i부터 1까지 감소하며 반복하는 문법
        for (j in i downTo 1) {
            // 한 칸씩 왼쪽으로 이동
            if (arr[j] < arr[j - 1]) {
                // 스와프(Swap)
                val temp = arr[j]
                arr[j] = arr[j - 1]
                arr[j - 1] = temp
            } else break
        }
    }
    for (i in 0 until n) {
        print("${arr[i]} ")
    }
}
