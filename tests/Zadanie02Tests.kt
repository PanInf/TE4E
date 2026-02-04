import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Zadanie02Tests {
    @Test
    fun testZad21() {
        assertEquals(9, zad21(intArrayOf(1,2,3,4,5,6,7,8,9,0)))
        assertEquals(1, zad21(intArrayOf(1)))
    }

    @Test
    fun testZad22() {
        assertEquals(0, zad22(intArrayOf(1,2,3,4,5,6,7,8,9,0)))
        assertEquals(1, zad22(intArrayOf(1)))
    }

    @Test
    fun testZad23() {
        assertEquals(8, zad23(intArrayOf(1,2,3,4,5,6,7,8,9,0)))
        assertNull(zad23(intArrayOf(1)))
        assertNull(zad23(intArrayOf()))
    }

    @Test
    fun testZad24() {
        assertEquals(150, zad24(intArrayOf(10,20,30,40,50)))
        assertEquals(0, zad24(intArrayOf()))
    }

    @Test
    fun testZad25() {
        assertEquals(12, zad25(intArrayOf(1,2,3,4,5,6)))
        assertEquals(0, zad25(intArrayOf(1,3,5)))
    }

    @Test
    fun testZad26() {
        assertEquals(9, zad26(intArrayOf(1,2,3,4,5)))
        assertEquals(0, zad26(intArrayOf(2,4,6)))
    }

    @Test
    fun testZad27() {
        assertTrue(zad27(intArrayOf(1,2,3,2,1)))
        assertFalse(zad27(intArrayOf(1,2,3)))
    }

    @Test
    fun testZad28() {
        assertFalse(zad28(intArrayOf(2,1,2,1)))
        assertFalse(zad28(intArrayOf(1,2,3,4)))
    }

    @Test
    fun testZad29() {
        assertTrue(zad29(intArrayOf(1,3,2,4,3,5)))
        assertFalse(zad29(intArrayOf(1,2,3,4)))
        assertTrue(zad29(intArrayOf(1)))
    }

    @Test
    fun testZad210() {
        assertEquals(5, zad210(intArrayOf(1,2,3,4,5,6,7,8,9,0)))
        assertEquals(0, zad210(intArrayOf(1,3,5,7,9)))
    }
}
