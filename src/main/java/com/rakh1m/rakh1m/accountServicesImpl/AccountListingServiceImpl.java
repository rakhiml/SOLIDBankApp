package com.rakh1m.rakh1m.accountServicesImpl;

import com.rakh1m.rakh1m.accounts.Account;
import com.rakh1m.rakh1m.dao.AccountDAO;
import com.rakh1m.rakh1m.accounts.AccountType;
import com.rakh1m.rakh1m.accounts.AccountWithdraw;
import com.rakh1m.rakh1m.accountServices.AccountListingService;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {
    private AccountDAO accountDAO;

    public AccountListingServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account getClientAccounts(String clientID, String accountID) {
        accountDAO.getClientAccounts(clientID);
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }
}