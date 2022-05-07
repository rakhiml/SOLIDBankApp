package com.rakh1m.rakh1m;

public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;
    AccountCreationService accountCreation;

    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation;
    }

    public void createNewAccount(AccountType accountType, String clientID) {
        try {
            accountCreation.create(accountType, this.id, clientID, this.lastAccountNumber);
            incrementLastAccountNumber();
        } catch (WrongAccountType e) {
            System.out.println(e.getMessage());
        }

    }

    private void incrementLastAccountNumber() {
        this.lastAccountNumber += 1;
    }
}
