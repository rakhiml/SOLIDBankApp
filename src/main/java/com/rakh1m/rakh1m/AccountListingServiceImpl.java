package com.rakh1m.rakh1m;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService{
    AccountDAO accountDAO;

    @Override
    public Account getClientAccounts(String clientID, String accountID) {

        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return null;
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }
}
