package secondlab

fun areBothOdd(first: Int, second: Int): Boolean {
    return first % 2 == 0 && second % 2 == 0
}

fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    print(areBothOdd(first, second))
}