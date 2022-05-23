package com.rakh1m.solidbankapp.accountServicesImpl;

import com.rakh1m.solidbankapp.IncorrectAmountException;
import com.rakh1m.solidbankapp.TransactionRepository;
import com.rakh1m.solidbankapp.accountServices.AccountDepositService;
import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.accounts.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountDepositServiceImpl implements AccountDepositService {

    private AccountRepository accountRepository;

    @Override
    public void deposit(double amount, Account account) {

        if (amount <= 0) {
            //System.out.println("Incorrect amount!");
            throw new IncorrectAmountException("Please enter valid amount!");
        }

        account.setBalance(account.getBalance()+amount);
        accountRepository.save(account);
        //old method to update account without db
//        accountDAO.updateAccount(account, amount);
        System.out.println(String.format("Deposit : %.2f $", amount));
    }
}
