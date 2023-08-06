package easy.leetcodeStart

fun main() {}

fun fizzBuzz(n: Int): List<String> {
    val resultList = mutableListOf<String>()
    for (i in 0 until n) {
        resultList += if ((i + 1) % 15 == 0) {
            "FizzBuzz"
        } else if ((i + 1) % 3 == 0) {
            "Fizz"
        } else if ((i + 1) % 5 == 0) {
            "Buzz"
        } else (i + 1).toString()
    }
    return resultList
}