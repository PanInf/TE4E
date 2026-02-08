//1. Algorytm Euklidesa odejmowanie
//2. Algorytm Euklidesa modulo
//3. Fibonacci n-ty wyraz iteracyjnie
//4. Fibonacci n-ty wyraz rekrencyjnie
//5. Silnia n-ta iteracyjnie
//6. Silnia n-ta rekrencyjnie
//7. Algorytm Hornera
//8. Suma cyfr liczby
//9. Liczby pierwsze w przedziale <n, m>
//10.Wypisanie dzielników w przedziału <k, l> liczby x

// 3.)

// 1 1 2 3 5
// 1 + 1 = 2
fun fibonacciIter(n : Int) : Int {
    var a = 0
    var b = 1
    if (n == 0)
        return 0
    for (i in 2..n) {
        var temp = b
        b = b + a
        a = temp

    }
    return b
}
// 4.)
fun fibonacciReku(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return fibonacciReku(n - 1) + fibonacciReku(n - 2)
}


// 5.)
fun silniaIter(n : Int) : Int {
    if (n == 0)
        return 0
    var a = 1
    for (i in 2..n) {
        a = a * i
    }
    return a
}

// 6.)
fun silniaReku(n : Int) : Int {
    if (n == 0)
        return 0
    if (n == 1) return 1
    return silniaReku(n-1) * n
}

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
//    println(fibonacciReku(n))
//    println(fibonacciIter(n))
    println(silniaIter(n))
    println(silniaReku(n))
}