package com.rakh1m.rakh1m;

import java.util.List;

public class AccountBasicCLI {

    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListing;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListing) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }

    void createAccountRequest(String clientID) {
        AccountType at = createAccountOperationUI.requestAccountType();
        if (at == null) {
            System.out.println("Account has NOT been created");
            return;
        }
        bankCore.createNewAccount(at, clientID);

    }

    void getAccounts(String clientID) {
        List<Account> clientAccounts = accountListing.getClientAccounts(clientID);
        System.out.println(clientAccounts);
    }


}
