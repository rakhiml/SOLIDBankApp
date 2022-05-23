package com.rakh1m.solidbankapp.accounts;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


public class SavingAccount extends AccountWithdraw {


    public SavingAccount(String accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
