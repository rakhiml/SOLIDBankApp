package com.rakh1m.solidbankapp.accounts;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

@Builder
@Data
@AllArgsConstructor
@Persistent
public class Account {
    private String accountType;
    @Id
    private String id;
    private String clientID;
    private double balance;
    private boolean withdrawAllowed;


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



