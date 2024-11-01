package me.xanium.gemseconomy.data

import me.xanium.gemseconomy.account.Account
import me.xanium.gemseconomy.currency.Currency
import cc.mewcraft.economy.api.Account as EconomyAccount
import cc.mewcraft.economy.api.Currency as EconomyCurrency

fun EconomyAccount.toAccount(): Account {
    return Account(this)
}

fun Account.toEconomyAccount(): EconomyAccount {
    return this.delegate
}

fun EconomyCurrency.toCurrency(): Currency {
    return Currency(this)
}

fun Currency.toEconomyCurrency(): EconomyCurrency {
    return this.delegate
}