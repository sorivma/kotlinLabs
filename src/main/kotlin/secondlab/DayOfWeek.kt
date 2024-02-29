package secondlab

fun main() {
    val day = readln().toInt()

    val result = when(day) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> return
    }

    print(result)
}