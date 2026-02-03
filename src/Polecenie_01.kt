fun zad1() {
    var a = readln().toInt()
    var b = readln().toInt()
    while (a != b) {
        if (a > b) {
            a -= b
        } else {
            b -= a
        }
    }
    println(a)
}
