package com.rakh1m.solidbankapp.accounts;

import com.rakh1m.solidbankapp.Account;


public abstract class AccountDeposit extends Account {


    public AccountDeposit(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
}
