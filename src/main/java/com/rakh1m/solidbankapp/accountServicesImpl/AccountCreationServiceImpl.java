package com.rakh1m.solidbankapp.accountServicesImpl;

import com.rakh1m.solidbankapp.accountServices.AccountCreationService;
import com.rakh1m.solidbankapp.accounts.*;
import com.rakh1m.solidbankapp.dao.AccountDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;


    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        String accType = accountType == null ? "" : accountType.toString();
        Account acc;
        switch (accType) {
            case "FIXED":
                acc = new FixedAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, false);

                break;
            case "SAVING":
                acc = new SavingAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, true);
                break;
            case "CHECKING":
                acc = new CheckingAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, true);
                break;
            default:
                return;
        }

        accountDAO.createNewAccount(acc);

    }
}
