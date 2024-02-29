package secondlab

fun main() {
    val six = 6
    val two = 2

    val operation = readln().toInt()

    val result = when (operation) {
        1 -> two + six
        2 -> two - six
        else -> return
    }

    println(result)
}