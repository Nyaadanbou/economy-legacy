package me.xanium.gemseconomy

import org.jetbrains.annotations.ApiStatus
import java.util.*

interface Account {
    fun getUuid(): UUID

    fun getDisplayName(): String

    fun getNickname(): String

    fun withdraw(currency: Currency, amount: Double): Boolean

    fun deposit(currency: Currency, amount: Double): Boolean

    fun setBalance(currency: Currency, amount: Double)

    fun getBalance(currency: Currency): Double

    fun getBalance(identifier: String): Double

    @ApiStatus.Internal
    fun getBalances(): Map<Currency, Double>

    fun getHeapBalance(currency: Currency): Double

    fun getHeapBalance(identifier: String): Double

    @ApiStatus.Internal
    fun getHeapBalances(): Map<Currency, Double>

    fun testOverflow(currency: Currency, amount: Double): Boolean

    fun hasEnough(amount: Double): Boolean

    fun hasEnough(currency: Currency, amount: Double): Boolean

    fun canReceiveCurrency(): Boolean

    fun setCanReceiveCurrency(canReceiveCurrency: Boolean)

    fun setNickname(nickname: String?) /*@Override boolean equals(Object o);

    @Override int hashCode();*/


}