package easy.leetcodeStart

fun main(){  }

fun runningSum(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var acc = 0
    for (i in nums.indices) {
        acc += nums[i]
        result[i] = acc
    }
    return result
}