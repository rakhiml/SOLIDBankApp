package com.rakh1m.solidbankapp.appUI;

import org.springframework.stereotype.Service;

@Service
public interface WithdrawDepositOperationCLIUI {


    double requestClientAmount();

    String requestClientAccountNumber();


}
