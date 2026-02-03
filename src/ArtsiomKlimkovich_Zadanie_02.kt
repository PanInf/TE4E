fun main() {

    val digits = intArrayOf(3, 7, 1, 9, 4, 6, 2, 8)
    val twoDigits = intArrayOf(12, 34, 56, 78, 90)

    println(z1(digits))
    println(z2(digits))
    println(z3(digits))
    println(z4(twoDigits))
    println(z5(digits))
    println(z6(digits))
    println(z7(digits))
    println(z8(digits))
    println(z9(digits))
    println(z10(digits))
}

fun z1(arr: IntArray): Int {
    var max = arr[0]
    for (x in arr) {
        if (x > max) max = x
    }
    return max
}

fun z2(arr: IntArray): Int {
    var min = arr[0]
    for (x in arr) {
        if (x < min) min = x
    }
    return min
}

fun z3(arr: IntArray): Int {
    var max1 = -1
    var max2 = -1
    for (x in arr) {
        if (x > max1) {
            max2 = max1
            max1 = x
        } else if (x > max2 && x != max1) {
            max2 = x
        }
    }
    return max2
}

fun z4(arr: IntArray): Int {
    var sum = 0
    for (x in arr) {
        sum += x
    }
    return sum
}

fun z5(arr: IntArray): Int {
    var sum = 0
    for (x in arr) {
        if (x % 2 == 0) sum += x
    }
    return sum
}

fun z6(arr: IntArray): Int {
    var sum = 0
    for (x in arr) {
        if (x % 2 != 0) sum += x
    }
    return sum
}

fun z7(arr: IntArray): Boolean {
    for (i in 0 until arr.size / 2) {
        if (arr[i] != arr[arr.size - 1 - i]) return false
    }
    return true
}

fun z8(arr: IntArray): Boolean {
    var evenSum = 0
    var oddSum = 0
    for (i in arr.indices) {
        if (i % 2 == 0) evenSum += arr[i]
        else oddSum += arr[i]
    }
    return evenSum == oddSum
}

fun z9(arr: IntArray): Boolean {
    for (i in 1 until arr.size - 1) {
        if (!(
                    (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) ||
                            (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])
                    )) return false
    }
    return true
}

fun z10(arr: IntArray): Int {
    var count = 0
    for (x in arr) {
        if (x % 2 == 0) count++
    }
    return count
}
