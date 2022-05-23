//package com.rakh1m.solidbankapp.dao;
//
//import com.rakh1m.solidbankapp.accounts.Account;
//import com.rakh1m.solidbankapp.accounts.AccountType;
//import com.rakh1m.solidbankapp.accounts.AccountWithdraw;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//public interface AccountDAO {
//    List<Account> getClientAccounts(String clientID);
//
//    void createNewAccount(Account account);
//
//    void updateAccount(Account account, Double amount);
//
//    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
//
//    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
//
//    Account getClientAccount(String clientID, String accountID);
//}
