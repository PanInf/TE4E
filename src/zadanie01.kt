import kotlin.math.sqrt

fun zad11(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (x != y) {
        if (x > y) x -= y else y -= x
    }
    println("NWD($a, $b) = $x")
    return x
}

fun zad12(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val t = y
        y = x % y
        x = t
    }
    println("NWD($a, $b) = $x")
    return x
}

fun zad13(n: Int): Int {
    if (n <= 1) return n
    var a = 0
    var b = 1
    repeat((2..n).count()) {
        val c = a + b
        a = b
        b = c
    }
    println("Fibonacci($n) = $b")
    return b
}

fun zad14(n: Int): Int {
    val result = if (n <= 1) n else zad14(n - 1) + zad14(n - 2)
    if (n < 3) println("Fibonacci($n) = $result")
    return result
}

fun zad15(n: Int): Int {
    var res = 1
    for (i in 2..n) res *= i
    println("$n! = $res")
    return res
}

fun zad16(n: Int): Int {
    val result = if (n <= 1) 1 else n * zad16(n - 1)
    if (n < 3) println("$n! = $result")
    return result
}

fun zad17(arr: IntArray, x: Int): Int {
    var result = 0
    for (i in arr.size - 1 downTo 0) {
        result = result * x + arr[i]
    }
    println("Wynik Hornera: $result")
    return result
}

fun zad18(n: Int): Int {
    var sum = 0
    var x = n
    while (x > 0) {
        sum += x % 10
        x /= 10
    }
    println("Suma cyfr $n = $sum")
    return sum
}

fun zad19(n: Int, m: Int): List<Int> {
    fun isPrime(x: Int): Boolean {
        if (x < 2) return false
        for (i in 2..sqrt(x.toDouble()).toInt()) if (x % i == 0) return false
        return true
    }

    val primes = (n..m).filter { isPrime(it) }
    println("Liczby pierwsze w <$n, $m>: $primes")
    return primes
}

fun zad110(x: Int, k: Int, l: Int): List<Int> {
    val divs = (k..l).filter { x % it == 0 }
    println("Dzielniki $x w <$k, $l>: $divs")
    return divs
}
