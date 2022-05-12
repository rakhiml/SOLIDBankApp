package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accountServices.AccountListingService;
import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.appUI.WithdrawDepositOperationCLIUI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransactionWithdrawCLI {
    private TransactionWithdraw transactionWithdraw;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListingService;

    public void withdrawMoney(String clientID) {
        String accountNumber = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        Account account = accountListingService.getClientWithdrawAccount(clientID, accountNumber);
        if (account == null) {
            System.out.println("Account available for withdraw HAS NOT been found!!!");
            return;
        } else {
            Double amount = withdrawDepositOperationCLIUI.requestClientAmount();
            transactionWithdraw.execute(account, amount);
        }
    }
}
