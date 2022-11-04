package sort.countingsort

const val MAX_VALUE = 9

fun main() {
    val n = 15
    // 모든 원소의 값이 0보다 크거나 같다고 가정
    val arr = intArrayOf(7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2)
    // 모든 범위를 포함하는 배열 선언(모든 값은 0으로 초기화)
    val cnt = IntArray(MAX_VALUE + 1)
    for (i in 0 until n) {
        cnt[arr[i]] += 1 // 각 데이터에 해당하는 인덱스의 값 증가
    }
    for (i in 0..MAX_VALUE) { // 배열에 기록된 정렬 정보 확인
        for (j in 0 until cnt[i]) {
            print("$i ") // 띄어쓰기를 기준으로 등장한 횟수만큼 인덱스 출력
        }
    }
}
