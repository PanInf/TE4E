/* 1 */
fun gcdSubtraction(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (x != y) {
        if (x > y) x -= y
        else y -= x
    }
    return x
}

/* 2 */
fun gcdModulo(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val r = x % y
        x = y
        y = r
    }
    return x
}

/* 3 */
fun fibIter(n: Int): Int {
    if (n <= 1) return n
    var a = 0
    var b = 1
    for (i in 2..n) {
        val c = a + b
        a = b
        b = c
    }
    return b
}

/* 4 */
fun fibRec(n: Int): Int {
    if (n <= 1) return n
    return fibRec(n - 1) + fibRec(n - 2)
}

/* 5 Silnia iteracyjnie */
fun factorialIter(n: Int): Int {
    var result = 1
    for (i in 1..n) result *= i
    return result
}

/* 6 */
fun factorialRec(n: Int): Int {
    if (n <= 1) return 1
    return n * factorialRec(n - 1)
}

/* 7 */
fun horner(a: IntArray, x: Int): Int {
    var result = a[0]
    for (i in 1 until a.size) {
        result = result * x + a[i]
    }
    return result
}

/* 8 */
fun digitSum(n: Int): Int {
    var num = n
    var sum = 0
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}


/* 9 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
fun primesInRange(n: Int, m: Int) {
    for (i in n..m) {
        if (isPrime(i)) print("$i ")
    }
}

/* 10 */
fun divisorsInRange(x: Int, k: Int, l: Int) {
    for (i in k..l) {
        if (x % i == 0) print("$i ")
    }
}
