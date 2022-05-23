package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accountServices.AccountListingService;
import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.accounts.AccountRepository;
import com.rakh1m.solidbankapp.accounts.AccountType;
import com.rakh1m.solidbankapp.appUI.CreateAccountOperationUI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class AccountBasicCLI {

    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListing;
    AccountRepository accountRepository;

    void createAccountRequest(String clientID) {
        AccountType at = createAccountOperationUI.requestAccountType();
        if (at == null) {
            System.out.println("Account has NOT been created.");
            return;
        } else {
            bankCore.createNewAccount(at, clientID);
        }

    }

    void getAccounts(String clientID) {
        //List<Account> clientAccounts = accountListing.getClientAccounts(clientID);
        System.out.println(accountRepository.findAll());//clientAccounts);
    }


}
