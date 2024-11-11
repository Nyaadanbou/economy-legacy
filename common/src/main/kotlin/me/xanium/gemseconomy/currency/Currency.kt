@file:Suppress(
    "unused",
)

package me.xanium.gemseconomy.currency

import net.kyori.adventure.text.format.TextColor
import java.util.UUID
import cc.mewcraft.economy.api.Currency as EconomyCurrency

class Currency(
    @JvmField
    val delegate: EconomyCurrency,
) {
    fun getSingular(): String {
        return delegate.name
    }

    fun getUuid(): UUID {
        return delegate.uuid
    }

    fun getName(): String {
        return delegate.name
    }

    fun setName(name: String) {
        delegate.name = name
    }

    fun getDefaultBalance(): Double {
        return delegate.defaultBalance
    }

    fun setDefaultBalance(defaultBalance: Double) {
        delegate.defaultBalance = defaultBalance
    }

    fun getMaximumBalance(): Double {
        return delegate.maximumBalance
    }

    fun setMaximumBalance(maxBalance: Double) {
        delegate.maximumBalance = maxBalance
    }

    fun simpleFormat(amount: Double): String {
        return delegate.simpleFormat(amount)
    }

    fun fancyFormat(amount: Double): String {
        return delegate.fancyFormat(amount)
    }

    fun getDisplayName(): String {
        return delegate.displayName
    }

    fun getColor(): TextColor {
        return delegate.color
    }

    fun setColor(color: TextColor?) {
        delegate.setColor(color)
    }

    fun getSymbolNullable(): String? {
        return delegate.symbolNullable
    }

    fun getSymbolOrEmpty(): String {
        return delegate.symbolOrEmpty
    }

    fun setSymbol(symbol: String?) {
        delegate.symbol = symbol
    }

    fun isDefaultCurrency(): Boolean {
        return delegate.isDefaultCurrency
    }

    fun setDefaultCurrency(defaultCurrency: Boolean) {
        delegate.isDefaultCurrency = defaultCurrency
    }

    fun isDecimalSupported(): Boolean {
        return delegate.isDecimalSupported
    }

    fun setDecimalSupported(decimal: Boolean) {
        delegate.isDecimalSupported = decimal
    }

    fun isPayable(): Boolean {
        return delegate.isPayable
    }

    fun setPayable(payable: Boolean) {
        delegate.isPayable = payable
    }

    fun getExchangeRate(): Double {
        return delegate.exchangeRate
    }

    fun setExchangeRate(exchangeRate: Double) {
        delegate.exchangeRate = exchangeRate
    }

    fun update(other: Currency) {
        delegate.update(other.delegate)
    }

    override fun toString(): String {
        return delegate.toString()
    }
}