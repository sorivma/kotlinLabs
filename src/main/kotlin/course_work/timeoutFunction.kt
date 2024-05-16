package course_work

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

suspend fun exampleSuspendFunction(delayMillis: Long, value: Int): Int {
    delay(delayMillis)
    return value
}

suspend fun <T> applyTimeoutHandler(
    timeoutMills: Long,
    block: suspend () -> T,
    timeoutHandler: (TimeoutCancellationException) -> Unit,
    resultHandler: (T) -> Unit,
) {
    try {
        val result = withTimeout(timeoutMills) { block() }
        resultHandler(result)
    } catch (e: TimeoutCancellationException) {
        timeoutHandler(e)
    }
}

fun main(): Unit = runBlocking {
    val timeOut = 1000L
    val timeOutMessage = "Too long body execution"

    applyTimeoutHandler(
        timeOut,
        {
            exampleSuspendFunction(500, 42)
        },
        {
            println(timeOutMessage)
        },
        { result ->
            println("Результат: $result")
        })

    applyTimeoutHandler(
        timeOut,
        {
            exampleSuspendFunction(10000, 100)
        },
        {
            println(timeOutMessage)
        },
        {result ->
            println("Результат: $result")
        }
    )
}


