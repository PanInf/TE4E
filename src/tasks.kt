fun main(args: Array<String>) {
//functions test
//    println(rangeIdentifier(5,7,6))
//    println(tableGenerator(20,0,9))
    var testTable = tableGenerator(10,0,9)
    var numberTable: MutableList<Number> = testTable.map { it as Number } as MutableList<Number>
    println(numberTable)
// 1. Znajdź największy element w tablicy (cyfry 0-9)
    println(findMaxElementInTable(numberTable))

// 2. Znajdź najmniejszy element w tablicy (cyfry 0-9)
    println(findMinElementInTable(numberTable))

// 3. Znajdź drugi największy element (vice-max) w tablicy (cyfry 0-9)

    println(findViceMaxElementInTable(numberTable))
// 4. Oblicz sumę wszystkich elementów tablicy (liczby 10-99)
    testTable = tableGenerator(10,10,99)
    numberTable = testTable.map { it as Number } as MutableList<Number>
    println(tableSum(numberTable))
// 5. Oblicz sumę elementów parzystych w tablicy (cyfry 0-9)
// 6. Oblicz sumę elementów nieparzystych w tablicy (cyfry 0-9)
// 7. Sprawdź czy tablica jest lustrzana (palindrom) (cyfry 0-9)
// 8. Sprawdź czy suma elementów na parzystych indeksach równa się sumie na nieparzystych indeksach (cyfry 0-9)
// 9. Sprawdź czy tablica jest "skacząca" - elementy naprzemiennie mniejsze i większe (cyfry 0-9)
// 10. Policz ile jest liczb parzystych w tablicy (cyfry 0-9)
}
fun findMaxElementInTable(table: MutableList<Number>):Number{
    var max = 0.0;
    for(number in table){
        val temp = number.toDouble()
        if(temp > max){
            max = temp
        }
    }
    return max
}

fun findMinElementInTable(table: MutableList<Number>): Number{
    var min = table[0].toDouble();
    for(number in table){
        val temp = number.toDouble()
        if(temp < min){
            min = temp
        }
    }
    return min
}

fun findViceMaxElementInTable(table: MutableList<Number>):Number{
    var max = findMaxElementInTable(table).toDouble();
    var viceMax = 0.0
    for(number in table){
        val temp = number.toDouble()
        if(temp > viceMax && temp < max){
            viceMax = temp
        }
    }
    return viceMax
}

fun tableSum(table: List<Number>):Number{
    var sum = 0.0

    for (number in table){
        sum += number.toDouble()
    }

    return sum
}



fun rangeIdentifier(min: Number, max: Number, numberToCheck: Number): Boolean {
    return numberToCheck.toDouble() in  min.toDouble() .. max.toDouble()
}

fun tableGenerator(length:Int, min: Int, max: Int): MutableList<Int>{
    val result = mutableListOf<Int>()
    for(i in 0 until length){
        result.add((min..max).random())
    }
    return result
}