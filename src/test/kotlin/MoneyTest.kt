import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MoneyTest {
    @Test
    internal fun `test multiplication`() {
        val five = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    internal fun `test equality`() {
        assertEquals(Money.dollar(5), Money.dollar(5))
        assertNotEquals(Money.dollar(5), Money.dollar(6))
        assertEquals(Money.franc(5), Money.franc(5))
    }

    @Test
    internal fun `test Currency`() {
        assertEquals(
            "USD",
            Money.dollar(1).currency()
        )
        assertEquals(
            "CHF",
            Money.franc(1).currency()
        )
    }

    @Test
    internal fun `test simple addition`() {
        val sum = Money.dollar(5).plus(Money.dollar(5))
        assertEquals(Money.dollar(10), sum)
    }
}