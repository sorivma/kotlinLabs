package course_work

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(): Unit = runBlocking {
    launch {
        while (true) {
            delay(1000L)
            printCurrentTime()
        }
    }
    println("А корутина-то уже запущена")
    delay(2000L)
    println("Теперь уже точно запущена")
}

fun printCurrentTime() {
    val currentTime = LocalDateTime.now();
    val formatter = DateTimeFormatter.ofPattern("YYYY:HH:mm:ss")

    println("Текущее время: ${currentTime.format(formatter)}")
}
