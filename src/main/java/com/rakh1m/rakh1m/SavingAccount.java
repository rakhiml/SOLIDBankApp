package com.rakh1m.rakh1m;

public class SavingAccount extends AccountWithdraw {
    public SavingAccount(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
}
