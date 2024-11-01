package me.xanium.gemseconomy.currency

import cc.mewcraft.economy.api.Economy
import me.xanium.gemseconomy.data.toCurrency

class CurrencyManager(
    private val economy: Economy
) {
    fun getCurrencies(): List<Currency> {
        return economy.loadedCurrencies.map { it.toCurrency() }
    }
}