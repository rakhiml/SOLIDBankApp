package com.rakh1m.solidbankapp.accountServicesImpl;

import com.rakh1m.solidbankapp.Account;
import com.rakh1m.solidbankapp.dao.AccountDAO;
import com.rakh1m.solidbankapp.accounts.AccountType;
import com.rakh1m.solidbankapp.accounts.AccountWithdraw;
import com.rakh1m.solidbankapp.accountServices.AccountListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class AccountListingServiceImpl implements AccountListingService {
    private AccountDAO accountDAO;

//    public AccountListingServiceImpl(AccountDAO accountDAO) {
//        this.accountDAO = accountDAO;
//    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return accountDAO.getClientAccount(clientID,accountID);
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
       return accountDAO.getClientWithdrawAccount(clientID, accountID);

    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }
}
