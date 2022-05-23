package com.rakh1m.solidbankapp.accountServicesImpl;

import com.rakh1m.solidbankapp.IncorrectAmountException;
import com.rakh1m.solidbankapp.accountServices.AccountWithdrawService;
import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.accounts.AccountRepository;
import com.rakh1m.solidbankapp.accounts.AccountWithdraw;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountWithdrawServiceImpl implements AccountWithdrawService {
    private AccountRepository accountRepository;

    @Override
    public void withdraw(double amount, Account account) {
        if (amount <= 0) {
            //System.out.println("Incorrect amount");
            throw new IncorrectAmountException("Please enter valid amount");
        }

        double currentBalance = account.getBalance();
        if (currentBalance < amount) {
            //System.out.println("Not enough funds on account!");
            throw new IncorrectAmountException("Not enough funds on account :( ");
        }
        account.setBalance(currentBalance - amount);
        accountRepository.save(account);
        //old method to update acc wihtout db;
        //accountDAO.updateAccount(account, amount * -1);
        System.out.println(String.format("Withdrawn : %.2f $", amount));
    }
}
