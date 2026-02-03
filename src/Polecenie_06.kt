fun zad6(n: Int): Int {
    if (n == 0) return 1
    return n * silnia(n - 1)
}
