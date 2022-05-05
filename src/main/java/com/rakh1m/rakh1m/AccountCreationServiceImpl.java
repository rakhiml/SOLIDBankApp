package com.rakh1m.rakh1m;

public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        Account acc = new Account(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, false);
        accountDAO.createNewAccount(acc);

    }
}
