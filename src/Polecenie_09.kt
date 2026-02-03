fun zad9() {
    val n = readLine().toInt()
    val m = readLine().toInt()
    for (i in n..m) {
        if (i > 1) {
            var pierwsza = true
            for (j in 2 until i) {
                if (i % j == 0) {
                    pierwsza = false
                }
            }
            if (pierwsza) {
                println(i)
            }
        }
    }
}
