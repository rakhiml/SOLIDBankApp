package com.rakh1m.rakh1m.accounts;

public class AccountDeposit extends Account {

    public AccountDeposit(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }

}
