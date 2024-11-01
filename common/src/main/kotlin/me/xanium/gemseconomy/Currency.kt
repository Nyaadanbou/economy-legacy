package me.xanium.gemseconomy

import net.kyori.adventure.text.format.TextColor
import java.util.*

interface Currency {
    fun getUuid(): UUID

    fun getName(): String

    fun setName(name: String)

    @Deprecated("in favor of {@link #getName()}")
    fun getSingular(): String {
        return getName()
    }

    fun getDefaultBalance(): Double

    fun setDefaultBalance(defaultBalance: Double)

    fun getMaximumBalance(): Double

    fun setMaximumBalance(maxBalance: Double)


    @Deprecated("in favor of {@link #simpleFormat(double)} and {@link #fancyFormat(double)}")
    fun format(amount: Double): String {
        return simpleFormat(amount)
    }

    /**
     * Gets a plain string describing the balance amount.
     *
     *
     * This string is used for logging or anywhere that does not support [Component].
     *
     * @param amount the balance amount
     * @return a plain string describing the balance amount
     */
    fun simpleFormat(amount: Double): String

    /**
     * Gets a MiniMessage string describing the balance amount.
     *
     *
     * Since this is a MiniMessage string, it is meant to be used for display that support [Component].
     * The caller of this method should deserialize the MiniMessage string on their own.
     *
     * @param amount the balance amount
     * @return a MiniMessage string describing the balance amount
     */
    fun fancyFormat(amount: Double): String

    fun getDisplayName(): String

    fun getColor(): TextColor

    fun setColor(color: TextColor?)


    @Deprecated("in favor of {@link #getSymbolNullable()} and {@link #getSymbolOrEmpty()}")
    fun getSymbol(): String? {
        return getSymbolNullable()
    }

    fun getSymbolNullable(): String?

    fun getSymbolOrEmpty(): String

    fun setSymbol(symbol: String?)

    fun isDefaultCurrency(): Boolean

    fun setDefaultCurrency(defaultCurrency: Boolean)

    fun isDecimalSupported(): Boolean

    fun setDecimalSupported(decimal: Boolean)

    fun isPayable(): Boolean

    fun setPayable(payable: Boolean)

    fun getExchangeRate(): Double

    fun setExchangeRate(exchangeRate: Double)

    /**
     * Copy all states of specific object to this object.
     *
     * @param other the currency from which the states are copied
     */
    fun update(other: Currency)
}