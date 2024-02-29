package firstlab

fun divide(input : Int) : String {
    return input.toString().toList().joinToString(",")
}

fun main() {
    println(divide(readln().toInt()))
}