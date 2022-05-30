package com.rakh1m.solidbankapp.accountServicesImpl;

import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.accounts.AccountRepository;
import com.rakh1m.solidbankapp.accounts.AccountType;
import com.rakh1m.solidbankapp.accounts.AccountWithdraw;
import com.rakh1m.solidbankapp.accountServices.AccountListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class AccountListingServiceImpl implements AccountListingService {
    //private AccountDAO accountDAO;
    private AccountRepository accountRepository;

    @Override
    public Account getClientAccount(String clientID, String accountID) {
       return accountRepository.getAccountByClientIDAndId(clientID, accountID);
        // return accountRepository.findById(accountID).orElse(null); //accountDAO.getClientAccount(clientID,accountID);
    }

    @Override
    public Account getClientWithdrawAccount(String clientID, String accountID) {
        return accountRepository.getAccountByIdAndClientIDAndWithdrawAllowedIsTrue(accountID, clientID);
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
//        List<Account> acc = new ArrayList<>();
//        for(var x : accountRepository.findAll()) acc.add(x);
        return accountRepository.findByClientId(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        //List<Account> acc = new ArrayList<>();
        //for(var x : accountRepository.findAll())
        return accountRepository.findByClientId(clientID);
    }
}
