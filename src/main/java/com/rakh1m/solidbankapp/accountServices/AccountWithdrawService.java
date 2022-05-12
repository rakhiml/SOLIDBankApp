package com.rakh1m.solidbankapp.accountServices;

import com.rakh1m.solidbankapp.accounts.AccountWithdraw;
import org.springframework.stereotype.Service;

@Service
public interface AccountWithdrawService {

    void withdraw(double amount, AccountWithdraw account);
}
