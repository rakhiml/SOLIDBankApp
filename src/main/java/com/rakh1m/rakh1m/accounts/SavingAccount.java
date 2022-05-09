package com.rakh1m.rakh1m.accounts;

import com.rakh1m.rakh1m.accounts.AccountType;
import com.rakh1m.rakh1m.accounts.AccountWithdraw;

public class SavingAccount extends AccountWithdraw {
    public SavingAccount(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
}
