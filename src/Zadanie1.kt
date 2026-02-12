fun main() {
//    println(z1(6, 4))
//    println(z2(6, 4))
//    println(z3(4))
//    println(z4(4))
//    println(z5(5))
//    println(z6(5))
//    println(z7(intArrayOf(5, 2, 7),2))
//    println(z8(123))
//    println(z9(3, 8))
//    println(z10(1, 10, 10))
}

fun z1(a: Int, b: Int): Int {
    var a : Int = a
    var b : Int = b
    while (b != 0) {
        if (a > b) {
            a -= b
        }
        else{
            b -= a
        }
    }
    return a
}

fun z2(a: Int, b: Int): Int {
    var a : Int = a
    var b : Int = b
    var x : Int
    while (b > 0){
        x = a % b
        a = b
        b = x
    }
    return a
}

fun z3(n: Int): Int {
    if (n <= 2){
        return 1
    }
    var a = 1
    var b = 1
    var r : Int
    for (i in 3..n){
        r = a + b
        a = b
        b = r
    }
    return b
}

fun z4(n : Int) : Int {
    if (n == 1 || n == 2) return 1
    return z4(n - 1) + z4(n - 2)
}

fun z5(n : Int) : Int {
    var w = 1
    for (i in 1..n){
        w *= i
    }
    return w
}

fun z6(n : Int) : Int {
    if (n == 1 || n == 0) return 1
    return n * z6(n - 1)
}

fun z7(a: IntArray, x: Int) : Int {
    var w = a[0]
    for (i in 1 until x){
        w = w * x + a[i]
    }
    return w
}

fun z8(n : Int) : Int {
    var n = n
    var sum = 0
    while (n > 0){
        sum += n % 10
        n /= 10
    }
    return sum
}

fun z9CzyPierwsza(n : Int) : Boolean {
    if (n < 2) return false
    for (i in 2 until n){
        if (n % i == 0) return false
    }
    return true
}
fun z9(a: Int, b: Int){
    for (i in a..b){
        if(z9CzyPierwsza(i)){
            println(i)
        }
    }
}

fun z10(a: Int, b: Int, x : Int){
    for (i in a..b){
        if (i != 0 && x % i == 0){
            println(i)
        }
    }
}
