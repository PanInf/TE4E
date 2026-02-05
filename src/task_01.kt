//1. Algorytm Euklidesa odejmowanie
//2. Algorytm Euklidesa modulo
//3. Fibonacci n-ty wyraz iteracyjnie
//4. Fibonacci n-ty wyraz rekrencyjnie
//5. Silnia n-ta iteracyjnie
//6. Silnia n-ta rekrencyjnie
//7. Algorytm Hornera
//8. Suma cyfr liczby
//9. Liczby pierwsze w przedziale <n, m>
//10.Wypisanie dzielników w przedziału <k, l> liczby x

fun main(){
    println(FibonacciIterational(5))
    println(FibonacciRecursive(5))
    println(factorialIterational(4))
    println(factorialRecursive(4))
    println(HornerAlgorithm(listOf(2,-6,2,-1), 3))
}
fun EuklidesSub(a: Int, b: Int):Int{
    var x = kotlin.math.abs(a)
    var y = kotlin.math.abs(b)

    if (x == 0) return y
    if (y == 0) return x

    while (x != y) {
        if (x > y) {
            x -= y
        } else {
            y -= x
        }
    }

    return x
}

fun EuklidesMod(a: Int, b: Int): Int{
    var x = kotlin.math.abs(a)
    var y = kotlin.math.abs(b)

    while (y != 0) {
        val r = x % y
        x = y
        y = r
    }

    return x
}

fun FibonacciIterational(length: Int): List<Int>{
    val result = mutableListOf<Int>()
    var a = 1
    var b = a

    for(i in 1 until length + 1){
        val temp = a + b
        b = a
        a = temp

        result.add(b)
    }
    return result
}

fun FibonacciRecursive(length: Int): Int {
    val result = mutableListOf<Int>()
    return if(length in 0..1) 1
    else FibonacciRecursive(length-1) + FibonacciRecursive(length-2)
}

fun factorialIterational(length: Int): List<Int>{
    val result = mutableListOf<Int>()
    var calc = length

    for(i in length-1 downTo 1){
        calc *= i
        result.add(calc)
    }
    return result
}

fun factorialRecursive(length: Int): Int{
    return when(length){
        1 -> return 1
        else -> length * factorialRecursive(length-1)
    }
}

fun HornerAlgorithm(function: List<Int>, x:Int):Int{
    var result = function[0] * x
    val functionSize = function.size

    for(element in 1..<functionSize-1){
        result = (result + function[element]) * x
    }
    return result + function[functionSize-1]
}

