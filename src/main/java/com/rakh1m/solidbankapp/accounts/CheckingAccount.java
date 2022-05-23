package com.rakh1m.solidbankapp.accounts;

import lombok.RequiredArgsConstructor;


public class CheckingAccount extends AccountWithdraw {


    public CheckingAccount(String accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
