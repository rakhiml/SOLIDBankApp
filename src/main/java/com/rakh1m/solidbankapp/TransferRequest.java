package com.rakh1m.solidbankapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(onConstructor = @__(@JsonCreator))
public class TransferRequest {
    private double amount;
}
