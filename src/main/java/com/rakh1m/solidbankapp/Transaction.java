package com.rakh1m.solidbankapp;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
//@Builder
@RequiredArgsConstructor
public class Transaction {

    @Id
    private int id;
    private final Double amount;
    private final String transactionType;



}
