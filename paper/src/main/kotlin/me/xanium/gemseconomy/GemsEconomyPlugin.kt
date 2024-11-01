package me.xanium.gemseconomy

import cc.mewcraft.economy.api.EconomyProvider
import me.xanium.gemseconomy.account.AccountManager
import me.xanium.gemseconomy.currency.CurrencyManager
import org.bukkit.plugin.java.JavaPlugin

class GemsEconomyPlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        val economy = EconomyProvider.get()
        GemsEconomy.getInstance().accountManager = AccountManager(economy)
        GemsEconomy.getInstance().currencyManager = CurrencyManager(economy)
    }

    override fun onDisable() {
        // Plugin shutdown logic
        GemsEconomy.getInstance().unregister()
    }
}