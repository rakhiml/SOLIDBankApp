package com.rakh1m.rakh1m;

import com.rakh1m.rakh1m.accountServices.AccountCreationService;
import com.rakh1m.rakh1m.accounts.AccountType;

public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;
    AccountCreationService accountCreation;

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
