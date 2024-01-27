import java.util.TreeSet

data class Word(val str: String) : Comparable<Word> {
    override fun compareTo(other: Word): Int {
        return if (str.length == other.str.length) str.compareTo(other.str) else str.length.compareTo(other.str.length)
    }
}

fun main() {
    val n = readln().toInt()
    val treeSet = TreeSet<Word>()

    repeat(n) {
        treeSet.add(Word(readln()))
    }

    print(treeSet.joinToString("\n") { it.str })
}
