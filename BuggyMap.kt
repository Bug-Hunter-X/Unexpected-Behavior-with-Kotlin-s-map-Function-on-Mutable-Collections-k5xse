fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val newList = mutableListOf<Int>()
    for (i in list) {
        newList.add(i * 2)
    }
    println(newList) // Output: [2, 4, 6, 8, 10]
}