package firstlab

fun count(days : Int) {
    val years = days / 365
    val weeks = (days - years * 365) / 7
    val leftDays = days - years * 365 - weeks * 7
    println("Лет: $years, недель: $weeks, дней: $leftDays")
}

fun main() {
    count(readln().toInt())
}
