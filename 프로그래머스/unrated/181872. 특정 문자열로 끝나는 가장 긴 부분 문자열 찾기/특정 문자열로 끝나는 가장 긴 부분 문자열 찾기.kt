class Solution {
    fun solution(myString: String, pat: String) =
        (myString.indices).filter { myString.slice(0..it).endsWith(pat) }.map { myString.slice(0..it) }
            .sortedBy { -it.length }[0]
}