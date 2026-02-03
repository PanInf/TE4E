fun zad2() {
    var a = readLine().toInt()
    var b = readLine().toInt()
    while (b != 0) {
        val r = a % b
        a = b
        b = r
    }
    println(a)
}
