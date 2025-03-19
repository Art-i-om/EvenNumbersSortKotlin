fun getEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun main() {
    val numbers = readln().split(" ").map { it.toInt() }
    val evenNumbers = getEvenNumbers(numbers)

    for (number in evenNumbers){
        print(number)
        print(" ")
    }
}
