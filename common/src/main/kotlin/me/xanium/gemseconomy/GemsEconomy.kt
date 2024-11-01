package me.xanium.gemseconomy

import org.jetbrains.annotations.ApiStatus
import java.util.*

interface GemsEconomy {
    /**
     * Get an account, or create one if not existing.
     *
     * @param uuid account's unique ID
     * @return an account object with specific unique ID
     */
    @ApiStatus.Experimental
    fun pullAccount(uuid: UUID): Account

    /**
     * Get an account, or return null if not existing.
     *
     * @param uuid account's unique ID
     * @return an account object with specific unique ID
     */
    @ApiStatus.Experimental
    fun getAccount(uuid: UUID): Account?

    /**
     * Check if specific account exists in database.
     *
     * @param uuid account's unique ID
     * @return true if account with specific unique ID exists in database
     */
    fun hasAccount(uuid: UUID): Boolean

    /**
     * Deposit specified amount into specific account.
     *
     * @param uuid   the account's unique ID
     * @param amount the amount of default currency
     */
    fun deposit(uuid: UUID, amount: Double)

    /**
     * Deposit specified amount into specific account.
     *
     * @param uuid     the account's unique ID
     * @param amount   the amount of specific currency
     * @param currency the specific currency
     */
    fun deposit(uuid: UUID, amount: Double, currency: Currency)

    /**
     * Withdraw specific amount from specific account.
     *
     * @param uuid   the account's unique ID
     * @param amount the amount of default currency
     */
    fun withdraw(uuid: UUID, amount: Double)

    /**
     * Withdraw specific amount from specific account.
     *
     * @param uuid     the account's unique ID
     * @param amount   the amount of specific currency
     * @param currency the currency you withdraw from
     */
    fun withdraw(uuid: UUID, amount: Double, currency: Currency)

    /**
     * Lookup the balance of specific account.
     *
     * @param uuid the account's unique ID
     * @return the balance of default currency
     */
    fun getBalance(uuid: UUID): Double

    /**
     * Lookup the balance of specific account.
     *
     * @param uuid     the account's unique ID
     * @param currency the amount of default currency
     * @return the balance of specific currency
     */
    fun getBalance(uuid: UUID, currency: Currency): Double

    /**
     * @param name the currency name
     * @return a currency object of specific name
     */
    @ApiStatus.Experimental
    fun getCurrency(name: String): Currency?

    /**
     * @return the default currency
     */
    @ApiStatus.Experimental
    fun getDefaultCurrency(): Currency

    /**
     * @return an unmodifiable list of loaded currencies
     */
    @ApiStatus.Experimental
    fun getLoadedCurrencies(): List<Currency>
}