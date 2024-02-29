package secondlab

fun main() {
    print("Введите прибыль: ")
    val income = readln().toInt();
    print("Введите убытки: ")
    val lost = readln().toInt();

    val result = income - lost
    val answer = if (result >= 0) {"Прибыль составила $result"} else {"Ваши убытки составили: $result"}

    println(answer)
}