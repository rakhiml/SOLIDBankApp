package com.rakh1m.rakh1m.accounts;

import com.rakh1m.rakh1m.accounts.AccountDeposit;
import com.rakh1m.rakh1m.accounts.AccountType;

public class FixedAccount extends AccountDeposit {
    public FixedAccount(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
}
