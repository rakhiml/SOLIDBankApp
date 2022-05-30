package com.rakh1m.solidbankapp;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("TRANSACTION")
public class Transaction {

    @Id
    private int id;
    private final Double amount;
    private final String transactionType;
    private final String transactionID;

    @Builder
    public Transaction(Double amount, String transactionType, String transactionID) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionID = transactionID;
    }
}
