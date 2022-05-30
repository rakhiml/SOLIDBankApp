package com.rakh1m.solidbankapp.accountServicesImpl;

import com.rakh1m.solidbankapp.accountServices.AccountCreationService;
import com.rakh1m.solidbankapp.accounts.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountCreationServiceImpl implements AccountCreationService {

    private AccountRepository accountRepository;

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        String accType = accountType == null ? "" : accountType.toString();
        Account acc;
        switch (accType) {
            case "FIXED":
                acc = new FixedAccount(String.format("%03d%06d", 1, accountID), clientID, 0);
                break;
            case "SAVING":
                acc = new SavingAccount(String.format("%03d%06d", 1, accountID), clientID, 0);
                break;
            case "CHECKING":
                acc = new CheckingAccount(String.format("%03d%06d", 1, accountID), clientID, 0);
                break;
            default:
                return;

        }
        accountRepository.save(acc);
        System.out.println("Account has been created");
    }
}
