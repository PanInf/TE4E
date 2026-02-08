fun main() {
}

fun euklidesOdejmowanie(a: Int, b: Int): Int{
    var a = a
    var b = b
    while (a != b){
        if (a > b) a -= b
        else b -= a
    }
    return a
}

fun euklidesModulo(a: Int, b: Int): Int{
    var a = a
    var b = b
    while (b != 0){
        val r = a % b
        a = b
        b = r
    }
    return a
}

fun wyrazFibonacciegoIteracyjnie(n: Int): Int{
    if (n == 0) return 0
    if (n == 1) return 1

    var morePrevious = 0
    var previous = 1
    var actual: Int = 0
    for (i in 2..<n) {
        actual = previous + morePrevious
        morePrevious = previous
        previous = actual
    }
    return actual
}

fun wyrazFibonacciegoRekurencyjnie(n: Int): Int{
    if (n == 0) return 0
    if (n == 1) return 1
    return wyrazFibonacciegoRekurencyjnie(n-1) + wyrazFibonacciegoRekurencyjnie(n-2)
}

fun silniaIteracyjnie(n: Int): Int{
    var suma = 1
    for (i in 1..n){
        suma *= i
    }
    return suma
}

fun silniaRekurencyjnie(n: Int): Int{
    if (n == 1) return 1
    return n * silniaRekurencyjnie(n-1)
}

fun horner(wspolczynniki: IntArray, x: Int): Int {
    var wartosc = 0
    for (i in wspolczynniki) {
        wartosc = wartosc * x + i
    }
    return wartosc
}

fun sumaCyfr(liczba: Int): Int {
    var liczba = liczba
    var suma = 0

    while (liczba > 0) {
        suma += liczba % 10
        liczba /= 10
    }
    return suma
}

fun liczbyPierwszeZPrzedzialu(n: Int, m: Int): List<Int> {
    val liczby = mutableListOf<Int>()

    for (i in maxOf(2, n)..m) {
        var pierwsza = true
        for (j in 2..kotlin.math.sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                pierwsza = false
                break
            }
        }
        if (pierwsza) liczby.add(i)
    }
    return liczby
}

fun dzielnikiZPrzedzialu(x: Int, k: Int, l: Int): List<Int> {
    val dzielniki = mutableListOf<Int>()

    for (i in k..l) {
        if (i != 0 && x % i == 0) {
            dzielniki.add(i)
        }
    }
    return dzielniki
}