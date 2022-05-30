package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accountServices.AccountDepositService;
import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.dao.TransactionDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    private TransactionDAO transactionDAO;


    //Execution of transaction
    public void execute(Account account, double amount) {

        try {
            accountDepositService.deposit(amount, account);

            transactionDAO.save(new Transaction(amount,"Deposit",account.getId()));

        } catch (IncorrectAmountException e) {

        }


    }
}
