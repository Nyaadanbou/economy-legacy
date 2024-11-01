package me.xanium.gemseconomy

import cc.mewcraft.economy.api.EconomyProvider
import org.bukkit.plugin.java.JavaPlugin

class GemsEconomyPlugin : JavaPlugin() {
    private var economy: DummyGemsEconomy? = null

    override fun onEnable() {
        // Plugin startup logic
        economy = DummyGemsEconomy(EconomyProvider.get())
        GemsEconomyProvider.register(economy!!)
    }

    override fun onDisable() {
        // Plugin shutdown logic
        economy = null
        GemsEconomyProvider.unregister()
    }
}