import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Zadanie01Tests {
    @Test
    fun testZad11() {
        assertEquals(6, zad11(48, 18))
        assertEquals(1, zad11(17, 1))
        assertEquals(5, zad11(5, 5))
    }

    @Test
    fun testZad12() {
        assertEquals(6, zad12(48, 18))
        assertEquals(1, zad12(17, 1))
        assertEquals(5, zad12(5, 5))
    }

    @Test
    fun testZad13() {
        assertEquals(0, zad13(0))
        assertEquals(1, zad13(1))
        assertEquals(55, zad13(10))
    }

    @Test
    fun testZad14() {
        assertEquals(0, zad14(0))
        assertEquals(1, zad14(1))
        assertEquals(55, zad14(10))
    }

    @Test
    fun testZad15() {
        assertEquals(1, zad15(0))
        assertEquals(1, zad15(1))
        assertEquals(120, zad15(5))
    }

    @Test
    fun testZad16() {
        assertEquals(1, zad16(0))
        assertEquals(1, zad16(1))
        assertEquals(120, zad16(5))
    }

    @Test
    fun testZad17() {
        assertEquals(17, zad17(intArrayOf(1, 2, 3), 2))
    }

    @Test
    fun testZad18() {
        assertEquals(15, zad18(12345))
        assertEquals(1, zad18(1))
        assertEquals(0, zad18(0))
    }

    @Test
    fun testZad19() {
        assertEquals(listOf(2, 3, 5, 7), zad19(2, 7))
        assertEquals(emptyList<Int>(), zad19(0, 1))
    }

    @Test
    fun testZad110() {
        assertEquals(listOf(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60), zad110(60, 1, 60))
        assertEquals(emptyList<Int>(), zad110(7, 2, 6))
    }
}
