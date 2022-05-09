package com.rakh1m.rakh1m.dao;

import com.rakh1m.rakh1m.accounts.Account;
import com.rakh1m.rakh1m.accounts.AccountType;
import com.rakh1m.rakh1m.accounts.AccountWithdraw;

import java.util.List;

public interface AccountDAO {
    List<Account> getClientAccounts(String clientID);

    void createNewAccount(Account account);

    void updateAccount(Account account);

    List<Account> getClientAccountsByType(String clientID, AccountType accountType);

    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

    Account getClientAccount(String clientID, String accountID);
}
