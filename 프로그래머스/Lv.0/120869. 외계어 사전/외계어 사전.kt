class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        val copySpell = spell.toSet()
        return if (dic.count { d-> d.map { it.toString() }.toSet() == copySpell } == 0) 2 else 1
    }
}