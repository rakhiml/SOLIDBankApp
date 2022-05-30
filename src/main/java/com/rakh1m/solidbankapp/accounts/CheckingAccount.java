package com.rakh1m.solidbankapp.accounts;

import lombok.RequiredArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Table("ACCOUNT")
public class CheckingAccount extends AccountWithdraw {


    public CheckingAccount(String id, String clientID, double balance) {
        super("CHECKING", id, clientID, balance, true);
    }
}
