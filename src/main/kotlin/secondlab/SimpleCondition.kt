package secondlab

fun main() {
    val age = readln().toInt()
    val message = if (age > 18) {
        "Вам уже все можно"
    } else if (age == 18) {
        "Ура, Вам 18 лет"
    } else {
        "Вы еще слишком молоды"
    }

    println(message)
}