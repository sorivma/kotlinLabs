package firstlab

fun findNumber(number : Int) {
    println("$number${number * 2}")
}

fun main() {
    findNumber(readln().toInt())
}