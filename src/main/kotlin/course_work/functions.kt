package course_work

/**
 * Осуществляет композицию произвольного количества функций в одну
 */
fun <T> composeFunctions(funList: List<(T) -> T>): (T) -> T {
    return { x ->
        var result = x
        for (function in funList) {
            result = function(result)
        }
        result
    }
}


/**
 * Циклически применяет функции из предоставленного списка к элеметам массива
 */
fun <T, R> zipWithFunctions(funList: List<(T) -> R>): (List<T>) -> List<R> {
    return { list ->
        list.mapIndexed { index, item ->
            funList[index % funList.size](item)
        }
    }
}

fun double(x : Int): Int {
    return x * 2
}

fun square(x: Int): Int {
    return x * x
}

fun subtractFive(x: Int): Int {
    return x - 5
}

fun main() {
}
