package com.rakh1m.solidbankapp.accounts;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateAccountRequest {
    private String accountType;
    //private String id;
    private String clientID;
    //private Double balance;
    private Boolean withdrawAllowed;
}
