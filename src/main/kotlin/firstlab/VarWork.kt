package firstlab

fun printMessage(name: String, age: Int) {
    println("Привет, $name! Тебе уже $age")
}

fun main() {
    println("Введите имя, нажмите Enter, введите возраст")
    printMessage(readln(), readln().toInt())
}