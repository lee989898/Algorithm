import java.util.TreeMap
import java.util.TreeSet

data class Word(val name: String, val count: Int) : Comparable<Word> {
    override fun compareTo(other: Word): Int {
        return if (count != other.count) {
            other.count.compareTo(count)
        } else if (name.length != other.name.length) {
            other.name.length.compareTo(name.length)
        } else {
            name.compareTo(other.name)
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = TreeMap<String, Int>()
    val words = TreeSet<Word>()

    repeat(n) {
        val input = readln()

        if (input.length >= m) {
            map[input] = map.getOrDefault(input, 0) + 1
        }
    }

    for ((name, count) in map) {
        words.add(Word(name, count))
    }

    print(words.joinToString("\n") { it.name })
}
