import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Zadanie03Tests {
    @Test
    fun testZad31() {
        assertTrue(zad31(153))
        assertFalse(zad31(123))
    }

    @Test
    fun testZad32() {
        assertEquals(16, zad32(12))
        assertEquals(0, zad32(1))
    }

    @Test
    fun testZad33() {
        assertEquals(4, zad33("7992739871"))
        assertEquals(0, zad33("0"))
    }

    @Test
    fun testZad34() {
        assertEquals("LVIII", zad34(58))
        assertEquals("MCMXCIV", zad34(1994))
    }

    @Test
    fun testZad35() {
        assertTrue(zad35(19))
        assertFalse(zad35(4))
    }

    @Test
    fun testZad36() {
        assertEquals(listOf(2,2,3,5), zad36(60))
        assertEquals(listOf(7), zad36(7))
    }

    @Test
    fun testZad37() {
        assertEquals(9, zad37(52839))
        assertEquals(1, zad37(1))
    }

    @Test
    fun testZad38() {
        assertTrue(zad38(12321))
        assertFalse(zad38(12345))
    }

    @Test
    fun testZad39() {
        assertEquals(10, zad39(4))
        assertEquals(1, zad39(1))
    }

    @Test
    fun testZad310() {
        assertEquals(4, zad310(15))
        assertEquals(1, zad310(2))
    }
}
