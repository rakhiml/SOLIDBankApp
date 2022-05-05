package com.rakh1m.rakh1m;

public class AccountWithdraw extends Account {
    public AccountWithdraw(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
}
