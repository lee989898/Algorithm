class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        val copySpell = spell.joinToString("").toSet()
        return if (dic.count { it.toSet() == copySpell } == 0) 2 else 1
    }
}
