package com.rakh1m.solidbankapp.accounts;


public abstract class AccountWithdraw extends Account {
    public AccountWithdraw(String accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }

}
