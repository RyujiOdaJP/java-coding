fun main() {

    val list = listOf(1, "A", 2, "B")

    val intList = filterByType<Int>(list)
    println(intList)  //=> [1, 2]

    val strList = filterByType<String>(list)
    println(strList)  //=> [A, B]
}

fun <T> filterByType(list: List<*>) : List<T> {
    val result = mutableListOf<T>()
    list.forEach {
        // ERROR: cannot check for instance of erased type: T
        if (it is T) result.add(it)
    }
    return result
}