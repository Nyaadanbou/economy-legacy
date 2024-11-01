package me.xanium.gemseconomy

import org.jetbrains.annotations.ApiStatus

object GemsEconomyProvider {
    private var INSTANCE: GemsEconomy? = null

    /**
     * Provides static access to the [GemsEconomy] API.
     *
     *
     * Ideally, the ServiceManager for the platform should be used to obtain an
     * instance, however, this provider can be used if this is not viable.
     *
     * @return an instance of the GemsEconomy API
     * @throws IllegalStateException if the API is not loaded yet
     */
    @JvmStatic
    fun get(): GemsEconomy {
        return checkNotNull(INSTANCE) { "Instance is not loaded yet." }
    }

    @JvmStatic
    @ApiStatus.Internal
    fun register(instance: GemsEconomy) {
        INSTANCE = instance
    }

    @JvmStatic
    @ApiStatus.Internal
    fun unregister() {
        INSTANCE = null
    }
}