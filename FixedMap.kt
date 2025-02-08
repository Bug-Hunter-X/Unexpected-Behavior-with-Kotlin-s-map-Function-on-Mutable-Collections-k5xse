fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    //The below code avoids the mutable list creation and directly creates the doubled list
    val newList = list.map { it * 2 }
    println(newList) // Output: [2, 4, 6, 8, 10]
} 