package secondlab

fun main() {
    val six = 6
    val two = 2
    println("""
        У вас есть числа 2 и 6
        1. Добавить
        2. Отнять
        0. Ничего
    """.trimIndent())

    val operation = readln().toInt()

    val result = when (operation) {
        1 -> two + six
        2 -> two - six
        else -> return
    }

    println(result)
}