package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accounts.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
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

//    public double getBalance() {
//        return this.balance;
//    }

    @Override
    public String toString() {
        return "Account{" +
//                accountType +
                ", id='" + id + '\'' +
                ", clientID='" + clientID + '\'' +
                ", balance=" + balance +

                '}';
    }

//    public String getClientID() {
//        return clientID;
//    }
//
//    public void setClientID(String clientID) {
//        this.clientID = clientID;
//    }

//    public Account(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
//        this.accountType = accountType;
//        this.id = id;
//        this.clientID = clientID;
//        this.balance = balance;
//        this.withDrawAllowed = withDrawAllowed;
//    }

//    public void setWithDrawAllowed(boolean withDrawAllowed) {
//        this.withDrawAllowed = withDrawAllowed;
//    }

//    public AccountType getAccountType() {
//        return this.accountType;
//    }

//    public void setAccountType(AccountType accountType) {
//        this.accountType = accountType;
//    }

//    public String getId() {
//        return this.id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }


}
