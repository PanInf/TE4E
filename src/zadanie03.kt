import kotlin.math.pow

fun zad31(n: Int): Boolean {
    val digits = n.toString().map { it - '0' }
    val pow = digits.size
    val sum = digits.sumOf { it.toDouble().pow(pow.toDouble()).toInt() }
    val result = sum == n
    println("$n jest liczbą Armstronga: $result")
    return result
}

fun zad32(n: Int): Int {
    val sum = (1 until n).filter { n % it == 0 }.sum()
    println("Suma dzielników właściwych $n: $sum")
    return sum
}

fun zad33(number: String): Int {
    val digits = number.reversed().map { it - '0' }
    val sum = digits.mapIndexed { i, d ->
        if (i % 2 == 1) {
            val doubled = d * 2
            if (doubled > 9) doubled - 9 else doubled
        } else d
    }.sum()
    val control = (10 - (sum % 10)) % 10
    println("Cyfra kontrolna Luhn dla $number: $control")
    return control
}

fun zad34(num: Int): String {
    val romans = listOf(
        1000 to "M", 900 to "CM", 500 to "D", 400 to "CD",
        100 to "C", 90 to "XC", 50 to "L", 40 to "XL",
        10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I"
    )
    var n = num
    val sb = StringBuilder()
    for ((v, s) in romans) {
        while (n >= v) {
            sb.append(s)
            n -= v
        }
    }
    val result = sb.toString()
    println("$num w rzymskich: $result")
    return result
}

fun zad35(n: Int): Boolean {
    var x = n
    val seen = mutableSetOf<Int>()
    while (x != 1 && x !in seen) {
        seen.add(x)
        x = x.toString().map { it - '0' }.sumOf { it * it }
    }
    val result = x == 1
    println("$n jest szczęśliwa: $result")
    return result
}

fun zad36(n: Int): List<Int> {
    var x = n
    val factors = mutableListOf<Int>()
    var d = 2
    while (x > 1) {
        while (x % d == 0) {
            factors.add(d)
            x /= d
        }
        d++
    }
    println("Czynniki pierwsze $n: $factors")
    return factors
}

fun zad37(n: Int): Int {
    var x = n
    var max = 0
    while (x > 0) {
        val d = x % 10
        if (d > max) max = d
        x /= 10
    }
    println("Największa cyfra w $n: $max")
    return max
}

fun zad38(n: Int): Boolean {
    var x = n
    var rev = 0
    while (x > 0) {
        rev = rev * 10 + x % 10
        x /= 10
    }
    val result = n == rev
    println("$n jest palindromem: $result")
    return result
}

fun zad39(n: Int): Int {
    val result = n * (n + 1) / 2
    println("$n-ta liczba trójkątna: $result")
    return result
}

fun zad310(n: Int): Int {
    val count = Integer.bitCount(n)
    println("Liczba jedynek w $n: $count")
    return count
}
