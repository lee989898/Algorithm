import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    // 떡의 개수(N)와 요청한 떡의 길이(M)
    val n = sc.nextInt()
    val m = sc.nextInt()

    // 각 떡의 개별 높이 정보
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = sc.nextInt()
    }

    // 이진 탐색을 위한 시작점과 끝점 설정
    var start = 0
    var end = 1e9.toInt()
    // 이진 탐색 수행 (반복적)
    var result = 0
    while (start <= end) {
        var total: Long = 0
        val mid = (start + end) / 2
        for (i in 0 until n) {
            // 잘랐을 때의 떡의 양 계산
            if (arr[i] > mid) total += (arr[i] - mid).toLong()
        }
        if (total < m) { // 떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
            end = mid - 1
        } else { // 떡의 양이 충분한 경우 덜 자르기(오른쪽 부분 탐색)
            result = mid // 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result에 기록
            start = mid + 1
        }
    }
    println(result)
}
