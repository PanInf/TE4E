fun zad8() {
    var n = readLine().toInt()
    var suma = 0
    while (n > 0) {
        suma += n % 10
        n /= 10
    }
    println(suma)
}
