package com.rakh1m.rakh1m.accountServicesImpl;

import com.rakh1m.rakh1m.accountServices.AccountCreationService;
import com.rakh1m.rakh1m.accounts.*;
import com.rakh1m.rakh1m.dao.AccountDAO;

public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        String accType = accountType == null ? "" : accountType.toString();
        Account acc;
        switch (accType) {
            case "FIXED":
                acc = new FixedAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, false);
                break;
            case "SAVING":
                acc = new SavingAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, false);
                break;
            case "CHECKING":
                acc = new CheckingAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, false);
                break;
            default:
                return;
        }

        accountDAO.createNewAccount(acc);

    }
}
