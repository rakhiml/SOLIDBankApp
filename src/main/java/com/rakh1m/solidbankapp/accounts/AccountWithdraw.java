package com.rakh1m.solidbankapp.accounts;


public abstract class AccountWithdraw extends Account {
    public AccountWithdraw(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
//    public AccountWithdraw(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
//        super(accountType, id, clientID, balance, withDrawAllowed);
//    }
}
