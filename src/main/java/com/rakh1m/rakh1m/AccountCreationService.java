package com.rakh1m.rakh1m;

public interface AccountCreationService {

    void create(AccountType accountType, long bankID, String clientID, long accountID);
}
