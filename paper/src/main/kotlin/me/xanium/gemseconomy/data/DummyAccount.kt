package me.xanium.gemseconomy.data

import me.xanium.gemseconomy.Account
import me.xanium.gemseconomy.Currency
import java.util.*
import cc.mewcraft.economy.api.Account as EconomyAccount

data class DummyAccount(
    val delegate: EconomyAccount,
) : Account {
    override fun getUuid(): UUID {
        return delegate.uuid
    }

    override fun getDisplayName(): String {
        return delegate.displayName
    }

    override fun getNickname(): String {
        return delegate.nickname
    }

    override fun withdraw(currency: Currency, amount: Double): Boolean {
        return delegate.withdraw(currency.toEconomyCurrency(), amount)
    }

    override fun deposit(currency: Currency, amount: Double): Boolean {
        return delegate.deposit(currency.toEconomyCurrency(), amount)
    }

    override fun setBalance(currency: Currency, amount: Double) {
        delegate.setBalance(currency.toEconomyCurrency(), amount)
    }

    override fun getBalance(currency: Currency): Double {
        return delegate.getBalance(currency.toEconomyCurrency())
    }

    override fun getBalance(identifier: String): Double {
        return delegate.getBalance(identifier)
    }

    override fun getBalances(): Map<Currency, Double> {
        return delegate.balances.mapKeys { (cur, _) -> cur.toCurrency() }
    }

    override fun getHeapBalance(currency: Currency): Double {
        return delegate.getHeapBalance(currency.toEconomyCurrency())
    }

    override fun getHeapBalance(identifier: String): Double {
        return delegate.getHeapBalance(identifier)
    }

    override fun getHeapBalances(): Map<Currency, Double> {
        return delegate.heapBalances.mapKeys { (cur, _) -> cur.toCurrency() }
    }

    override fun testOverflow(currency: Currency, amount: Double): Boolean {
        return delegate.testOverflow(currency.toEconomyCurrency(), amount)
    }

    override fun hasEnough(amount: Double): Boolean {
        return delegate.hasEnough(amount)
    }

    override fun hasEnough(currency: Currency, amount: Double): Boolean {
        return delegate.hasEnough(currency.toEconomyCurrency(), amount)
    }

    override fun canReceiveCurrency(): Boolean {
        return delegate.canReceiveCurrency()
    }

    override fun setCanReceiveCurrency(canReceiveCurrency: Boolean) {
        delegate.setCanReceiveCurrency(canReceiveCurrency)
    }

    override fun setNickname(nickname: String?) {
        delegate.setNickname(nickname)
    }

}