fun zad5() {
    val n = readLine().toInt()
    var silnia = 1
    for (i in 1..n) {
        silnia *= i
    }
    println(silnia)
}
