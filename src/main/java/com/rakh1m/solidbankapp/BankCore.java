package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accountServices.AccountCreationService;
import com.rakh1m.solidbankapp.accounts.AccountType;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;
    private AccountCreationService accountCreation;
    @Autowired
    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation;
    }

    public void createNewAccount(AccountType accountType, String clientID) {

        accountCreation.create(accountType, id, clientID, this.lastAccountNumber);
        incrementLastAccountNumber();

    }

    private void incrementLastAccountNumber() {
        this.lastAccountNumber += 1;
    }
}
