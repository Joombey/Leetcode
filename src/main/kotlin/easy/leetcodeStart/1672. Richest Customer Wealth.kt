package easy.leetcodeStart

fun main() {}

fun maximumWealth(accounts: Array<IntArray>): Int {
    var wealth = 0
    for (i in accounts.indices) {
        var acc = 0
        for (j in accounts[i].indices) acc += accounts[i][j]
        if (acc >= wealth) {
            wealth = acc
        }
    }
    return wealth
}