package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accountServices.AccountWithdrawService;
import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.accounts.AccountWithdraw;
import com.rakh1m.solidbankapp.dao.TransactionDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransactionWithdraw {
    private AccountWithdrawService accountWithdrawService;
    private TransactionDAO transactionDAO;

    public void execute(Account account, double amount) {
        try { accountWithdrawService.withdraw(amount, account);
            transactionDAO.save(new Transaction(amount,"Withdraw"));}
        catch (IncorrectAmountException e) { }

    }
}
