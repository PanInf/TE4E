fun zad10() {
    val liczba = readLine().toInt()
    val k = readLine().toInt()
    val l = readLine().toInt()
    for (i in k..l) {
        if (liczba % i == 0) {
            println(i)
        }
    }
}
