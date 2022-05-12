package com.rakh1m.solidbankapp.accounts;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


public class FixedAccount extends AccountDeposit {

    public FixedAccount(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        super(accountType, id, clientID, balance, withDrawAllowed);
    }
}
