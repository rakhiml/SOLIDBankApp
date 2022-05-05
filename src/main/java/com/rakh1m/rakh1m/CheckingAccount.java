package com.rakh1m.rakh1m;

public class CheckingAccount extends AccountWithdraw {
    public CheckingAccount(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
}
