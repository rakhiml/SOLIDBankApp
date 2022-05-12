package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accountServices.AccountCreationService;
import com.rakh1m.solidbankapp.accounts.AccountType;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;
    @NonNull
    private AccountCreationService accountCreation;

    //Create new account
    public void createNewAccount(AccountType accountType, String clientID) {
        accountCreation.create(accountType, id, clientID, this.lastAccountNumber);
        incrementLastAccountNumber();
    }

    //Super stupid incrementer of id;
    private void incrementLastAccountNumber() {
        this.lastAccountNumber += 1;
    }
}
