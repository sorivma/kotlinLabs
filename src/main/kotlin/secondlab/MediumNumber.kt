package secondlab

import kotlin.math.max
import kotlin.math.min

fun medium(first: Int, second: Int, third: Int): Number {
    return max(min(first, second), min(max(first, second), third))
}

fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()

    if (first == second && second == third) {
        println("Ошибка")
    } else {
        println(medium(first, second, third))
    }
}