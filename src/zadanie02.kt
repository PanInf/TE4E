fun zad21(arr: IntArray): Int {
    val max = arr.maxOrNull() ?: Int.MIN_VALUE
    println("Największy element: $max")
    return max
}

fun zad22(arr: IntArray): Int {
    val min = arr.minOrNull() ?: Int.MAX_VALUE
    println("Najmniejszy element: $min")
    return min
}

fun zad23(arr: IntArray): Int? {
    val sorted = arr.distinct().sortedDescending()
    val result = if (sorted.size > 1) sorted[1] else null
    println("Drugi największy: $result")
    return result
}

fun zad24(arr: IntArray): Int {
    val sum = arr.sum()
    println("Suma elementów: $sum")
    return sum
}

fun zad25(arr: IntArray): Int {
    val sum = arr.filter { it % 2 == 0 }.sum()
    println("Suma parzystych: $sum")
    return sum
}

fun zad26(arr: IntArray): Int {
    val sum = arr.filter { it % 2 != 0 }.sum()
    println("Suma nieparzystych: $sum")
    return sum
}

fun zad27(arr: IntArray): Boolean {
    val isPal = arr.contentEquals(arr.reversedArray())
    println("Tablica palindrom: $isPal")
    return isPal
}

fun zad28(arr: IntArray): Boolean {
    val evenSum = arr.filterIndexed { i, _ -> i % 2 == 0 }.sum()
    val oddSum = arr.filterIndexed { i, _ -> i % 2 != 0 }.sum()
    val result = evenSum == oddSum
    println("Suma parzyste/nieparzyste indeksy równe: $result")
    return result
}

fun zad29(arr: IntArray): Boolean {
    if (arr.size < 2) return true
    var up = arr[1] > arr[0]
    for (i in 1 until arr.size-1) {
        if (up && arr[i+1] >= arr[i]) {
            println("Tablica skacząca: ${arr.toList()} -> false")
            return false
        }
        if (!up && arr[i+1] <= arr[i]) {
            println("Tablica skacząca: ${arr.toList()} -> false")
            return false
        }
        up = !up
    }
    println("Tablica skacząca: ${arr.toList()} -> true")
    return true
}

fun zad210(arr: IntArray): Int {
    val count = arr.count { it % 2 == 0 }
    println("Liczb parzystych: $count")
    return count
}
