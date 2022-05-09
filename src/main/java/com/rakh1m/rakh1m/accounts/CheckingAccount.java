package com.rakh1m.rakh1m.accounts;

import com.rakh1m.rakh1m.accounts.AccountType;
import com.rakh1m.rakh1m.accounts.AccountWithdraw;

public class CheckingAccount extends AccountWithdraw {
    public CheckingAccount(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
}
