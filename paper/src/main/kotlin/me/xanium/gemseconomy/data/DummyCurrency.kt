package me.xanium.gemseconomy.data

import me.xanium.gemseconomy.Currency
import net.kyori.adventure.text.format.TextColor
import java.util.*
import cc.mewcraft.economy.api.Currency as EconomyCurrency

data class DummyCurrency(
    val delegate: EconomyCurrency
) : Currency {
    override fun getUuid(): UUID {
        return delegate.uuid
    }

    override fun getName(): String {
        return delegate.name
    }

    override fun setName(name: String) {
        delegate.name = name
    }

    override fun getDefaultBalance(): Double {
        return delegate.defaultBalance
    }

    override fun setDefaultBalance(defaultBalance: Double) {
        delegate.defaultBalance = defaultBalance
    }

    override fun getMaximumBalance(): Double {
        return delegate.maximumBalance
    }

    override fun setMaximumBalance(maxBalance: Double) {
        delegate.maximumBalance = maxBalance
    }

    override fun simpleFormat(amount: Double): String {
        return delegate.simpleFormat(amount)
    }

    override fun fancyFormat(amount: Double): String {
        return delegate.fancyFormat(amount)
    }

    override fun getDisplayName(): String {
        return delegate.displayName
    }

    override fun getColor(): TextColor {
        return delegate.color
    }

    override fun setColor(color: TextColor?) {
        delegate.setColor(color)
    }

    override fun getSymbolNullable(): String? {
        return delegate.symbolNullable
    }

    override fun getSymbolOrEmpty(): String {
        return delegate.symbolOrEmpty
    }

    override fun setSymbol(symbol: String?) {
        delegate.symbol = symbol
    }

    override fun isDefaultCurrency(): Boolean {
        return delegate.isDefaultCurrency
    }

    override fun setDefaultCurrency(defaultCurrency: Boolean) {
        delegate.isDefaultCurrency = defaultCurrency
    }

    override fun isDecimalSupported(): Boolean {
        return delegate.isDecimalSupported
    }

    override fun setDecimalSupported(decimal: Boolean) {
        delegate.isDecimalSupported = decimal
    }

    override fun isPayable(): Boolean {
        return delegate.isPayable
    }

    override fun setPayable(payable: Boolean) {
        delegate.isPayable = payable
    }

    override fun getExchangeRate(): Double {
        return delegate.exchangeRate
    }

    override fun setExchangeRate(exchangeRate: Double) {
        delegate.exchangeRate = exchangeRate
    }

    override fun update(other: Currency) {
        delegate.update((other as DummyCurrency).delegate)
    }

}