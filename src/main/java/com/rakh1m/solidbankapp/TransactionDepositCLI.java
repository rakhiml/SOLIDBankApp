package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accountServices.AccountListingService;
import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.appUI.WithdrawDepositOperationCLIUI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransactionDepositCLI {
    private TransactionDeposit transactionDeposit;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListingService;

    void depositMoney(String clientID) {
        String accountNumber = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        Account account = accountListingService.getClientAccount(clientID, accountNumber);
        if (account == null) {
            System.out.println("Account number has not been found!!!");
            return;
        } else {
            Double amount = withdrawDepositOperationCLIUI.requestClientAmount();
            transactionDeposit.execute(account, amount);
        }

    }
}
