package me.xanium.gemseconomy

import cc.mewcraft.economy.api.Economy
import me.xanium.gemseconomy.data.toAccount
import me.xanium.gemseconomy.data.toCurrency
import me.xanium.gemseconomy.data.toEconomyCurrency
import java.util.*

class DummyGemsEconomy(
    private val economy: Economy,
) : GemsEconomy {
    override fun pullAccount(uuid: UUID): Account {
        return economy.pullAccount(uuid).toAccount()
    }

    override fun getAccount(uuid: UUID): Account? {
        return economy.getAccount(uuid)?.toAccount()
    }

    override fun hasAccount(uuid: UUID): Boolean {
        return economy.hasAccount(uuid)
    }

    override fun deposit(uuid: UUID, amount: Double) {
        return economy.deposit(uuid, amount)
    }

    override fun deposit(uuid: UUID, amount: Double, currency: Currency) {
        return economy.deposit(uuid, amount, currency.toEconomyCurrency())
    }

    override fun withdraw(uuid: UUID, amount: Double) {
        return economy.withdraw(uuid, amount)
    }

    override fun withdraw(uuid: UUID, amount: Double, currency: Currency) {
        return economy.withdraw(uuid, amount, currency.toEconomyCurrency())
    }

    override fun getBalance(uuid: UUID): Double {
        return economy.getBalance(uuid)
    }

    override fun getBalance(uuid: UUID, currency: Currency): Double {
        return economy.getBalance(uuid, currency.toEconomyCurrency())
    }

    override fun getCurrency(name: String): Currency? {
        return economy.getCurrency(name)?.toCurrency()
    }

    override fun getDefaultCurrency(): Currency {
        return economy.defaultCurrency.toCurrency()
    }

    override fun getLoadedCurrencies(): List<Currency> {
        return economy.loadedCurrencies.map { it.toCurrency() }
    }

}