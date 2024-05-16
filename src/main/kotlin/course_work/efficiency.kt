package course_work

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun task(index: Int): Pair<Int, Boolean> {
    val randomNumber = Random.nextInt(1000)
    val isEven = randomNumber % 2 == 0
    return Pair(index, isEven)
}


fun main() = runBlocking {
    val results = HashMap<Int, Boolean>()
    val timeMills = measureTimeMillis {
        val jobs = List(100_000) { index ->
            async {
                task(index)
            }
        }
        jobs.forEach { job ->
            val (index, result) = job.await()
            results[index] = result
        }
    }

    val successCount = results.count { it.value }
    println("Общее кол-во успешно завершенных задач: $successCount")
    println("Общее время выполнения задач: $timeMills")

}