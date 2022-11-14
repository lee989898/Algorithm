package sequentialsearch

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.")
    // 원소의 개수
    val n = sc.nextInt()
    val target = sc.next()

    val arr = mutableListOf<String>()
    println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.")
    for (i in 0 until n) {
        arr.add(sc.next())
    }
    // 순차 탐색 수행 결과 출력
    println(sequantialSearch(n, target, arr))
}

// 순차 탐색 소스코드 구현
fun sequantialSearch(n: Int, target: String, arr: MutableList<String>): Int {
    // 각 원소를 하나씩 확인하며
    for (i in 0 until n) {
        println(arr[i])
        // 현재의 원소가 찾고자 하는 원소와 동일한 경우
        if (arr[i] == target) {
            return i + 1 // 현재의 위치 반환 (인덱스는 0부터 시작하므로 1 더하기)
        }
    }
    return -1 // 원소를 찾지 못한 경우 -1 반환
}
