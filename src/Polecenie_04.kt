fun zad4(n: Int): Int {
    if (n == 0) {
        return 0
    }
    if (n == 1) {
        return 1
    }
    return zad4(n - 1) + zad4(n - 2)
}
