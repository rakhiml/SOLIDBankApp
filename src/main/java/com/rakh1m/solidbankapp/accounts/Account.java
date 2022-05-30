package com.rakh1m.solidbankapp.accounts;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.relational.core.mapping.Table;


@Data
//@RequiredArgsConstructor
@Table("ACCOUNT")
public class Account {
    @ToString.Exclude
    @Id
    private int index;
    @NonNull private String accountType;
    @NonNull private String id;
    @NonNull private String clientID;
    @NonNull private double balance;
    @NonNull private boolean withdrawAllowed;

    @Builder
    public Account(@NonNull String accountType, @NonNull String id, @NonNull String clientID, @NonNull double balance, @NonNull boolean withdrawAllowed) {
        this.accountType = accountType;
        this.id = id;
        this.clientID = clientID;
        this.balance = balance;
        if(accountType.equals("FIXED")) this.withdrawAllowed = false;
        else {this.withdrawAllowed = withdrawAllowed;}
    }

//        @Override
//    public String toString() {
//        return "Account{" +
//                accountType +
//                ", id='" + id + '\'' +
//                ", clientID='" + clientID + '\'' +
//                ", balance=" + String.format("%.2f", balance) +
//
//                '}';
}



