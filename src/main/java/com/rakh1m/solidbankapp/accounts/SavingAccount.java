package com.rakh1m.solidbankapp.accounts;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


public class SavingAccount extends AccountWithdraw {

    public SavingAccount(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
}
