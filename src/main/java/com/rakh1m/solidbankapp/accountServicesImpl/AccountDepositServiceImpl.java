package com.rakh1m.solidbankapp.accountServicesImpl;

import com.rakh1m.solidbankapp.accountServices.AccountDepositService;
import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.dao.AccountDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountDepositServiceImpl implements AccountDepositService {

    private AccountDAO accountDAO;

    @Override
    public void deposit(double amount, Account account) {
        if (amount <= 0) {
            System.out.println("Incorrect amount!");
            return;
        }
        accountDAO.updateAccount(account, amount);
        System.out.println(String.format("Deposit : %.2f $", amount));
    }
}
