package com.rakh1m.rakh1m;

import java.util.List;

public class MemoryAccountDao implements AccountDAO{
    List<Account> accountList;
    @Override
    public List<Account> getClientAccounts(String clientID) {

        return null;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return null;
    }
}
