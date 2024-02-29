package secondlab

import kotlin.math.max
import kotlin.math.min

fun medium(first: Int, second: Int, third: Int): Number {
    return max(min(first, second), min(max(first, second), third))
}

fun main() {
    println(medium(readln().toInt(), readln().toInt(), readln().toInt()))
}