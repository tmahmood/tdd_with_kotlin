
class Money(private var _amount: Int, private var _currency: String) {
    companion object Factory{
        fun dollar(_amount: Int): Money {
            return Money(_amount, "USD")
        }
        fun franc(_amount: Int): Money {
            return Money(_amount, "CHF")
        }
    }

    var amount: Int
        get() = _amount
        set(value) {
            _amount = value
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        other as Money

        return amount == other.amount && currency() == other.currency()
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    fun times(multiplier: Int) : Money {
        return Money(amount * multiplier, currency())
    }
    fun currency(): String {
        return _currency
    }

    override fun toString(): String {
        return "Money(_amount=$_amount, _currency='$_currency')"
    }

    fun plus(addEnd: Money): Money {
        return Money(amount + addEnd.amount, currency())
    }

}