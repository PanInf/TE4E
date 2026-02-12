
/* 1 */
fun maxElement(tab: IntArray): Int {
    var max = tab[0]
    for (x in tab) if (x > max) max = x
    return max
}

/* 2 */
fun minElement(tab: IntArray): Int {
    var min = tab[0]
    for (x in tab) if (x < min) min = x
    return min
}

/* 3 */
fun secondMax(tab: IntArray): Int {
    var max = Int.MIN_VALUE
    var second = Int.MIN_VALUE

    for (x in tab) {
        if (x > max) {
            second = max
            max = x
        } else if (x < max && x > second) {
            second = x
        }
    }
    return second
}

/* 4 */
fun sumAll(tab: IntArray): Int {
    var sum = 0
    for (x in tab) sum += x
    return sum
}

/* 5 */
fun sumEven(tab: IntArray): Int {
    var sum = 0
    for (x in tab) if (x % 2 == 0) sum += x
    return sum
}

/* 6 */
fun sumOdd(tab: IntArray): Int {
    var sum = 0
    for (x in tab) if (x % 2 != 0) sum += x
    return sum
}

/* 7 */
fun isPalindrome(tab: IntArray): Boolean {
    for (i in 0 until tab.size / 2) {
        if (tab[i] != tab[tab.size - 1 - i]) return false
    }
    return true
}

/* 8 */
fun equalIndexSums(tab: IntArray): Boolean {
    var evenSum = 0
    var oddSum = 0

    for (i in tab.indices) {
        if (i % 2 == 0) evenSum += tab[i]
        else oddSum += tab[i]
    }
    return evenSum == oddSum
}

/* 9 */
fun isJumping(tab: IntArray): Boolean {
    for (i in 1 until tab.size - 1) {
        if (!((tab[i] > tab[i - 1] && tab[i] > tab[i + 1]) ||
              (tab[i] < tab[i - 1] && tab[i] < tab[i + 1]))) {
            return false
        }
    }
    return true
}

/* 10 */
fun countEven(tab: IntArray): Int {
    var count = 0
    for (x in tab) if (x % 2 == 0) count++
    return count
}
