package recursive

class Recursive2() {
    fun recursiveFunction100(i: Int) {
        // 100번째 호출을 했을때
        if (i == 100) {
            return
        }
        println("$i 번째 재귀 함수에서 ${i + 1}번째 재귀 함수를 호출합니다.")
        recursiveFunction100(i + 1)
        println("$i 번째 재귀 함수를 종료합니다.")
    }
}

