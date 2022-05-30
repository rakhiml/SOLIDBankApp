package com.rakh1m.solidbankapp.accounts;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Table("ACCOUNT")
public class SavingAccount extends AccountWithdraw {


    public SavingAccount(String id, String clientID, double balance) {
        super("SAVING", id, clientID, balance, true);
    }
}
