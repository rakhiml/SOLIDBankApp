package com.rakh1m.solidbankapp.accountServices;

import com.rakh1m.solidbankapp.accounts.Account;
import org.springframework.stereotype.Component;

@Component
public interface AccountDepositService {
    void deposit(double amount, Account account);
}
