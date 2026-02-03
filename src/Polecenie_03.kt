fun zad3() {
    val n = readLine()!!.toInt()
    var a = 0
    var b = 1
    if (n == 0) {
        println(a)
    } else if (n == 1) {
        println(b)
    } else {
        for (i in 2..n) {
            val c = a + b
            a = b
            b = c
        }
        println(b)
    }
}
