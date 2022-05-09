package com.rakh1m.rakh1m.accountServices;

import com.rakh1m.rakh1m.accounts.Account;
import com.rakh1m.rakh1m.accounts.AccountType;
import com.rakh1m.rakh1m.accounts.AccountWithdraw;

import java.util.List;

public interface AccountListingService {
    Account getClientAccounts(String clientID, String accountID);

    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

    List<Account> getClientAccounts(String clientID);

    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
