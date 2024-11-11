package me.xanium.gemseconomy;

import me.xanium.gemseconomy.account.AccountManager;
import me.xanium.gemseconomy.currency.CurrencyManager;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@SuppressWarnings("unused")
public class GemsEconomy {
    private static final GemsEconomy INSTANCE = new GemsEconomy();

    private CurrencyManager currencyManager;
    private AccountManager accountManager;

    public static @NotNull GemsEconomy getInstance() {
        return Objects.requireNonNull(INSTANCE, "api not initialized yet");
    }

    public AccountManager getAccountManager() {
        return accountManager;
    }

    public CurrencyManager getCurrencyManager() {
        return currencyManager;
    }

    @ApiStatus.Internal
    public void setAccountManager(@NotNull AccountManager accountManager) {
        Objects.requireNonNull(accountManager, "accountManager");
        this.accountManager = accountManager;
    }

    @ApiStatus.Internal
    public void setCurrencyManager(@NotNull CurrencyManager currencyManager) {
        Objects.requireNonNull(currencyManager, "currencyManager");
        this.currencyManager = currencyManager;
    }

    @ApiStatus.Internal
    public void unregister() {
        accountManager = null;
        currencyManager = null;
    }
}
