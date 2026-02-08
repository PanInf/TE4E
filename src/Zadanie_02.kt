fun main(){

}

fun najwiekszyElement(T: IntArray): Int {
    var max = T[0]
    for (i in T) {
        if (i > max) max = i
    }
    return max
}

fun najmniejszyElement(T: IntArray): Int {
    var min = T[0]
    for (i in T) {
        if (i < min) min = i
    }
    return min
}

fun viceMax(T: IntArray): Int {
    var max = T[0]
    var viceMax = T[0]

    for (i in T) {
        if (i > max) {
            viceMax = max
            max = i
        } else if (i > viceMax && i < max) {
            viceMax = i
        }
    }
    return viceMax
}

fun sumaElementowTablicy(T: IntArray): Int {
    var suma = 0
    for (i in T) {
        suma += i
    }
    return suma
}

fun sumaElementowParzystych(T: IntArray): Int {
    var suma = 0
    for (i in T) {
        if (i % 2 == 0) suma += i
    }
    return suma
}

fun sumaElementowNieparzystych(T: IntArray): Int {
    var suma = 0
    for (i in T) {
        if (i % 2 != 0) suma += i
    }
    return suma
}

fun czyPalindrom(T: IntArray): Boolean {
    var i = 0
    var l = T.size - 1

    while (i < l) {
        if (T[i] != T[l]) return false
        i++
        l--
    }
    return true
}

fun czySumaIndeksowRowna(T: IntArray): Boolean {
    var parzyste = 0
    var nieparzyste = 0

    for (i in T.indices) {
        if (i % 2 == 0) parzyste += T[i]
        else nieparzyste += T[i]
    }
    return parzyste == nieparzyste
}

fun czySkaczaca(T: IntArray): Boolean {
    if (T.size < 2) return true

    for (i in 1 until T.size - 1) {
        if (!((T[i] > T[i - 1] && T[i] > T[i + 1]) ||
                    (T[i] < T[i - 1] && T[i] < T[i + 1]))) {
            return false
        }
    }
    return true
}

fun ileParzystych(T: IntArray): Int {
    var ile = 0
    for (i in T) {
        if (i % 2 == 0) ile++
    }
    return ile
}