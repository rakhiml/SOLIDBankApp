package com.rakh1m.rakh1m.accountServices;

import com.rakh1m.rakh1m.accounts.AccountType;

public interface AccountCreationService {

    void create(AccountType accountType, long bankID, String clientID, long accountID);
}
