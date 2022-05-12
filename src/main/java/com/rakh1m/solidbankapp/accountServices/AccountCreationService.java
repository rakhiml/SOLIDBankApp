package com.rakh1m.solidbankapp.accountServices;

import com.rakh1m.solidbankapp.accounts.AccountType;


public interface AccountCreationService {

    void create(AccountType accountType, long bankID, String clientID, long accountID);
}
