package binarysearch

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    // 원소의 개수(n)와 찾고자 하는 값(target)을 입력받기
    val n = sc.nextInt()
    val target = sc.nextInt()

    // / 전체 원소 입력받기
    val arr = mutableListOf<Int>()
    for (i in 0 until n) {
        arr.add(sc.nextInt())
    }

    // 이진 탐색 수행 결과 출력
    val result = binarySearch(arr, target, 0, n - 1)
    if (result == -1) {
        println("원소가 존재하지 않습니다.")
    } else {
        println(result + 1)
    }
}

// 이진 탐색 소스코드 구현(반복문)
fun binarySearch(arr: MutableList<Int>, target: Int, start: Int, end: Int): Int {
    var start1 = start
    var end1 = end
    while (start1 <= end1) {
        val mid = (start1 + end1) / 2
        // 찾은 경우 중간점 인덱스 반환
        if (arr[mid] == target) return mid
        // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
        else if (arr[mid] > target) end1 = mid - 1
        // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
        else start1 = mid + 1
    }
    return -1
}
