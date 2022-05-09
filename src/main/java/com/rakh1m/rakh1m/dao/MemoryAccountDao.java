package com.rakh1m.rakh1m.dao;

import com.rakh1m.rakh1m.accounts.Account;
import com.rakh1m.rakh1m.dao.AccountDAO;
import com.rakh1m.rakh1m.accounts.AccountType;
import com.rakh1m.rakh1m.accounts.AccountWithdraw;

import java.util.ArrayList;
import java.util.List;

public class MemoryAccountDao implements AccountDAO {
    List<Account> accountList = new ArrayList<>();

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountList;


    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
        System.out.println("Account has been successfully created");
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
