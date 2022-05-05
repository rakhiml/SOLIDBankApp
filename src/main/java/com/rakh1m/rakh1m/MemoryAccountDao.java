package com.rakh1m.rakh1m;

import java.util.ArrayList;
import java.util.List;

public class MemoryAccountDao implements AccountDAO{
    List<Account> accountList = new ArrayList<>();
    @Override
    public List<Account> getClientAccounts(String clientID) {
//       if (accountList.size() == 0) {
//           System.out.println("Empty");;
//       }
           return accountList;


    }

    @Override
    public void createNewAccount(Account account) {
//        if (account == null) {
//            System.out.println("Error creating account");
//        }
        accountList.add(account);
        System.out.println("Account has been sucessfuly created");
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
