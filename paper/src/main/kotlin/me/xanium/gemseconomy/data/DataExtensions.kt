package me.xanium.gemseconomy.data

import me.xanium.gemseconomy.Account
import me.xanium.gemseconomy.Currency
import cc.mewcraft.economy.api.Account as EconomyAccount
import cc.mewcraft.economy.api.Currency as EconomyCurrency

fun EconomyAccount.toAccount(): Account {
    return DummyAccount(this)
}

fun Account.toEconomyAccount(): EconomyAccount {
    return (this as DummyAccount).delegate
}

fun EconomyCurrency.toCurrency(): Currency {
    return DummyCurrency(this)
}

fun Currency.toEconomyCurrency(): EconomyCurrency {
    return (this as DummyCurrency).delegate
}