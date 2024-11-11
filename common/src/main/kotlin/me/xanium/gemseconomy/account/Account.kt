@file:Suppress(
    "UnstableApiUsage",
    "unused",
)

package me.xanium.gemseconomy.account

import me.xanium.gemseconomy.currency.Currency
import me.xanium.gemseconomy.data.toCurrency
import me.xanium.gemseconomy.data.toEconomyCurrency
import java.util.UUID
import cc.mewcraft.economy.api.Account as EconomyAccount

class Account(
    @JvmField
    val delegate: EconomyAccount,
) {
    fun getUuid(): UUID {
        return delegate.uuid
    }

    fun getDisplayName(): String {
        return delegate.displayName
    }

    fun getNickname(): String {
        return delegate.nickname
    }

    fun withdraw(currency: Currency, amount: Double): Boolean {
        return delegate.withdraw(currency.toEconomyCurrency(), amount)
    }

    fun deposit(currency: Currency, amount: Double): Boolean {
        return delegate.deposit(currency.toEconomyCurrency(), amount)
    }

    fun setBalance(currency: Currency, amount: Double) {
        delegate.setBalance(currency.toEconomyCurrency(), amount)
    }

    fun getBalance(currency: Currency): Double {
        return delegate.getBalance(currency.toEconomyCurrency())
    }

    fun getBalance(identifier: String): Double {
        return delegate.getBalance(identifier)
    }

    fun getBalances(): Map<Currency, Double> {
        return delegate.balances.mapKeys { (cur, _) -> cur.toCurrency() }
    }

    fun getHeapBalance(currency: Currency): Double {
        return delegate.getHeapBalance(currency.toEconomyCurrency())
    }

    fun getHeapBalance(identifier: String): Double {
        return delegate.getHeapBalance(identifier)
    }

    fun getHeapBalances(): Map<Currency, Double> {
        return delegate.heapBalances.mapKeys { (cur, _) -> cur.toCurrency() }
    }

    fun testOverflow(currency: Currency, amount: Double): Boolean {
        return delegate.testOverflow(currency.toEconomyCurrency(), amount)
    }

    fun hasEnough(amount: Double): Boolean {
        return delegate.hasEnough(amount)
    }

    fun hasEnough(currency: Currency, amount: Double): Boolean {
        return delegate.hasEnough(currency.toEconomyCurrency(), amount)
    }

    fun canReceiveCurrency(): Boolean {
        return delegate.canReceiveCurrency()
    }

    fun setCanReceiveCurrency(canReceiveCurrency: Boolean) {
        delegate.setCanReceiveCurrency(canReceiveCurrency)
    }

    fun setNickname(nickname: String?) {
        delegate.setNickname(nickname)
    }

    override fun toString(): String {
        return delegate.toString()
    }
}