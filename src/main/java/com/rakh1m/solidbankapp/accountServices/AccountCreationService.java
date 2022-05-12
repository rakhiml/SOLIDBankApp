package com.rakh1m.solidbankapp.accountServices;

import com.rakh1m.solidbankapp.accounts.AccountType;
import org.springframework.stereotype.Service;


public interface AccountCreationService {

    void create(AccountType accountType, long bankID, String clientID, long accountID);
}
