package com.rakh1m.solidbankapp.appUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface WithdrawDepositOperationCLIUI {


    double requestClientAmount();
    String requestClientAccountNumber();


}
