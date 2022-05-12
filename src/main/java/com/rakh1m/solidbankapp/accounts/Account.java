package com.rakh1m.solidbankapp.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public abstract class Account {
    @Getter
    @Setter
    private AccountType accountType;
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String clientID;
    @Getter
    @Setter
    private double balance;
    @Getter
    @Setter
    private boolean withDrawAllowed;

    @Override
    public String toString() {
        return "Account{" +
                accountType +
                ", id='" + id + '\'' +
                ", clientID='" + clientID + '\'' +
                ", balance=" + String.format("%.2f", balance) +

                '}';
    }


}
