fun main() {
    val str = readln()

    print(str.replace("c=|c-|dz=|d-|lj|nj|s=|z=".toRegex(), "?").length)
}