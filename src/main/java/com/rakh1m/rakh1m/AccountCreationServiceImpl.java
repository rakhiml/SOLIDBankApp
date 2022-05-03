package com.rakh1m.rakh1m;

public class AccountCreationServiceImpl implements AccountCreationService {
    AccountDAO accountDAO;
    public AccountCreationServiceImpl(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        Account account = new Account(accountType,String.valueOf(bankID),clientID,0,accountType.getAccountType());
        accountDAO.createNewAccount(account);

    }
}
