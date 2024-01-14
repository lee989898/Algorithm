class Solution {
    fun solution(n: Int): Int {
        var answer = 1
        val arr = ArrayList<Int>()

        if (n == 1) return 1
        
        while (arr.size != 100) {
            if (answer % 3 != 0 && !answer.toString().contains("3")) {
                arr.add(answer)
                answer++
            } else {
                answer++
            }
        }
        
        return arr[n - 1]
    }
}
