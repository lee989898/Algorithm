
package sort.selectionsort

fun main() {
    val n = 10
    val arr = mutableListOf(7, 5, 9, 0, 3, 1, 6, 2, 4, 8)

    for (i in 0 until n) {
        var minIndex = i
        for (j in i + 1 until n) {
            if (arr[minIndex] > arr[j]) {
                minIndex = j
            }
        }
        val temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
    }
    for (i in 0 until n) {
        print("${arr[i]} ")
    }
}
