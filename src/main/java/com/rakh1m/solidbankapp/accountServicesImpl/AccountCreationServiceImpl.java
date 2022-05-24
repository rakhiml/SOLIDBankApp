package com.rakh1m.solidbankapp.accountServicesImpl;

import com.rakh1m.solidbankapp.accountServices.AccountCreationService;
import com.rakh1m.solidbankapp.accounts.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountCreationServiceImpl implements AccountCreationService {

    private AccountRepository accountRepository;

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        String accType = accountType == null ? "" : accountType.toString();
        Account acc;
        switch (accType) {
            case "FIXED":
                acc = new FixedAccount(accountType.toString(), String.format("%03d%06d", 1, accountID), clientID, 0, false);
                accountRepository.insert(acc.getAccountType(), acc.getId(), acc.getClientID(), acc.isWithdrawAllowed());
                break;
            case "SAVING":
                acc = new SavingAccount(accountType.toString(), String.format("%03d%06d", 1, accountID), clientID, 0, true);
                accountRepository.insert(acc.getAccountType(), acc.getId(), acc.getClientID(), acc.isWithdrawAllowed());
            case "CHECKING":
                acc = new CheckingAccount(accountType.toString(), String.format("%03d%06d", 1, accountID), clientID, 0, true);
                accountRepository.insert(acc.getAccountType(), acc.getId(), acc.getClientID(), acc.isWithdrawAllowed());

                break;
            default:
                return;
        }
        System.out.println("Account has been created");
    }
}
