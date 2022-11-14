import java.util.*

fun lowerBound(arr: IntArray, target: Int, start: Int, end: Int): Int {
    var start1 = start
    var end1 = end
    while (start1 < end1) {
        val mid = (start1 + end1) / 2
        if (arr[mid] >= target) end1 = mid else start1 = mid + 1
    }
    return start1
}

fun upperBound(arr: IntArray, target: Int, start: Int, end: Int): Int {
    var start1 = start
    var end1 = end
    while (start1 < end1) {
        val mid = (start1 + end1) / 2
        if (arr[mid] > target) end1 = mid else start1 = mid + 1
    }
    return end1
}

// 값이 [left_value, right_value]인 데이터의 개수를 반환하는 함수
fun countByRange(arr: IntArray, leftValue: Int, rightValue: Int): Int {
    // 유의: lowerBound와 upperBound는 end 변수의 값을 배열의 길이로 설정
    val rightIndex = upperBound(arr, rightValue, 0, arr.size)
    val leftIndex = lowerBound(arr, leftValue, 0, arr.size)
    return rightIndex - leftIndex
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    // 데이터의 개수 N, 찾고자 하는 값 x 입력받기
    val n = sc.nextInt()
    val x = sc.nextInt()

    // 전체 데이터 입력받기
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = sc.nextInt()
    }

    // 값이 [x, x] 범위에 있는 데이터의 개수 계산
    val cnt = countByRange(arr, x, x)

    // 값이 x인 원소가 존재하지 않는다면
    if (cnt == 0) println(-1) else println(cnt)
}
