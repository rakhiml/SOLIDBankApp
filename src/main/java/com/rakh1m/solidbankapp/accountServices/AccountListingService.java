package com.rakh1m.solidbankapp.accountServices;

import com.rakh1m.solidbankapp.Account;
import com.rakh1m.solidbankapp.accounts.AccountType;
import com.rakh1m.solidbankapp.accounts.AccountWithdraw;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AccountListingService {
    Account getClientAccount(String clientID, String accountID);

    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

    List<Account> getClientAccounts(String clientID);

    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
