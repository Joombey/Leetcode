package easy.leetcodeStart

fun main() {}

fun numberOfSteps(num: Int): Int {
    var counter = 0
    var mutableNum = num
    while (mutableNum != 0) {
        counter ++
        when (mutableNum % 2 == 0) {
            true -> mutableNum /= 2
            else -> mutableNum --
        }
    }
    return counter
}

fun numberOfStep(num: Int): Int {
    return if (num == 0) 0
    else if (num % 2 == 0) 1 + numberOfStep(num / 2)
    else 1 + numberOfStep(num - 1)
}