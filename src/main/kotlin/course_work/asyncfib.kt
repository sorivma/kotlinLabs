package course_work

import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun fibonacci(n: Int): Long {
    return if (n <= 1) {
        n.toLong()
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}

fun main(): Unit = runBlocking {
    val fibNum = 40
    println("Вычисляю $fibNum-ое число Фибоначи")

    val fib = async {
        fibonacci(fibNum)
    }

    launch {
        val result = fib.await()
        println("Fib($fibNum) = $result")
    }

    println("А я никого не жду")
}