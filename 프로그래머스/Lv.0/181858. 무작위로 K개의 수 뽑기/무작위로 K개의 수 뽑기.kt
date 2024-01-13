class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var copyArr = arr.toSet().take(k)

        while (copyArr.size != k) {
            copyArr += -1
        }

        return copyArr.toIntArray()
    }
}