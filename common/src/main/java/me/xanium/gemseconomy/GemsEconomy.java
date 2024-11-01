package me.xanium.gemseconomy;

import me.xanium.gemseconomy.account.AccountManager;
import me.xanium.gemseconomy.currency.CurrencyManager;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class GemsEconomy {
    private static final GemsEconomy INSTANCE = new GemsEconomy();

    private CurrencyManager currencyManager;
    private AccountManager accountManager;

    @NotNull
    public static GemsEconomy getInstance() {
        Objects.requireNonNull(INSTANCE, "GemsEconomy INSTANCE is not initialized yet!");
        return INSTANCE;
    }

    public AccountManager getAccountManager() {
        return accountManager;
    }

    @ApiStatus.Internal
    public void setAccountManager(@NotNull AccountManager accountManager) {
        Objects.requireNonNull(accountManager, "AccountManager cannot be null!");
        this.accountManager = accountManager;
    }

    public CurrencyManager getCurrencyManager() {
        return currencyManager;
    }

    @ApiStatus.Internal
    public void setCurrencyManager(@NotNull CurrencyManager currencyManager) {
        Objects.requireNonNull(currencyManager, "CurrencyManager cannot be null!");
        this.currencyManager = currencyManager;
    }

    @ApiStatus.Internal
    public void unregister() {
        accountManager = null;
        currencyManager = null;
    }
}
