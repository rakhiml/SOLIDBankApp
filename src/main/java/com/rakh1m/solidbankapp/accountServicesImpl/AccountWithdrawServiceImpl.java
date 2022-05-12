package com.rakh1m.solidbankapp.accountServicesImpl;

import com.rakh1m.solidbankapp.accountServices.AccountWithdrawService;
import com.rakh1m.solidbankapp.accounts.AccountWithdraw;
import com.rakh1m.solidbankapp.dao.AccountDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountWithdrawServiceImpl implements AccountWithdrawService {
    private AccountDAO accountDAO;

    @Override

    public void withdraw(double amount, AccountWithdraw account) {
        if (amount <= 0) {
            System.out.println("Incorrect amount");
            return;
        }

        double currentBalance = account.getBalance();
        if (currentBalance < amount) {
            System.out.println("Not enough funds on account!");
            return;
        }

        accountDAO.updateAccount(account, amount * -1);
        System.out.println(String.format("Withdrawn : %.2f $", amount));
    }
}
