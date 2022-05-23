//package com.rakh1m.solidbankapp.dao;
//
//import com.rakh1m.solidbankapp.accounts.Account;
//import com.rakh1m.solidbankapp.accounts.AccountType;
//import com.rakh1m.solidbankapp.accounts.AccountWithdraw;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//@Repository
//public class MemoryAccountDao implements AccountDAO {
//    List<Account> accountList = new ArrayList<>();
//
//    @Override
//    public List<Account> getClientAccounts(String clientID) {
//        return accountList;
//
//
//    }
//
//    @Override
//    public void createNewAccount(Account account) {
//        accountList.add(account);
//        System.out.println("Account has been successfully created");
//    }
//
//    @Override
//    public void updateAccount(Account account, Double amount) {
//
//        account.setBalance(account.getBalance() + amount);
//
//    }
//
//    @Override
//    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
//        return null;
//    }
//
//    @Override
//    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
//        for (var account : accountList) {
//            if (account.getClientID().equals(clientID)
//                    && account.getId().equals(accountID) && account.isWithdrawAllowed()) {
//                return (AccountWithdraw) account;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Account getClientAccount(String clientID, String accountID) {
//        for (var account : accountList) {
//            if (account.getClientID().equals(clientID)
//                    && account.getId().equals(accountID)) {
//                return account;
//            }
//        }
//        return null;
//    }
//
//}
