@file:Suppress(
    "UnstableApiUsage",
    "unused",
)

package me.xanium.gemseconomy.account

import cc.mewcraft.economy.api.Economy
import me.xanium.gemseconomy.data.toAccount
import org.bukkit.entity.Player
import org.jetbrains.annotations.ApiStatus
import java.util.UUID

class AccountManager(
    private val economy: Economy,
) {
    @ApiStatus.Experimental
    fun pullAccount(uuid: UUID): Account {
        return economy.pullAccount(uuid).toAccount()
    }

    @ApiStatus.Experimental
    fun getAccount(player: Player): Account? {
        return getAccount(player.uniqueId)
    }

    @ApiStatus.Experimental
    fun getAccount(uuid: UUID): Account? {
        return economy.getAccount(uuid)?.toAccount()
    }
}