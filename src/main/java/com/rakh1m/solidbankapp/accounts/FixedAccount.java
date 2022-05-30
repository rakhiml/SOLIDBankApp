package com.rakh1m.solidbankapp.accounts;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Table("ACCOUNT")
public class FixedAccount extends AccountDeposit {


    public FixedAccount(String id, String clientID, double balance) {
        super("FIXED", id, clientID, balance, false);
    }
}
