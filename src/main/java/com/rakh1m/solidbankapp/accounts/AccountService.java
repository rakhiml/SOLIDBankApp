package com.rakh1m.solidbankapp.accounts;

import com.rakh1m.solidbankapp.BankCore;
import com.rakh1m.solidbankapp.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountService {
    private AccountRepository accountRepository;
    private BankCore bankCore;

    public List<Account> getAccounts(String client_id) {
        if (accountRepository.getAccountsByClientID(client_id).isEmpty())
            throw new AccountException("There is NO account associated with client: " + client_id);
        return accountRepository.getAccountsByClientID(client_id);
    }

    public Account getAccount(String client_id, String id) {
        if (accountRepository.getAccountByClientIDAndId(client_id, id) == null)
            throw new AccountException("There is no account associated with id:" + id);
        return accountRepository.getAccountByClientIDAndId(client_id, id);
    }

    public String createAccount(CreateAccountRequest userRequest) {
        String accountType = userRequest.getAccountType();
        try {
            Enum.valueOf(AccountType.class, accountType).toString();
        } catch (Exception e) {
            throw new WrongAccountTypeException("Invalid Account Type");
        }

        Account account = Account.builder().
                accountType(accountType).
                id(String.format("%03d%06d", 1, bankCore.getLastAccountNumber())).
                clientID(userRequest.getClientID()).
                balance(0).
                withdrawAllowed(userRequest.getWithdrawAllowed()).
                build();
        Account createdAccount = accountRepository.save(account);
        return createdAccount.getId();
    }

    public void deleteAccount(String id) {
        Account account = accountRepository.getAccountById(id);
        if(account == null) throw new AccountException("not found");
        accountRepository.delete(account);
    }


//        try {
//            accountRepository.getAccountsByClientID(client_id);
//            //accountRepository.findAll();
//        } catch (Exception e) {
//            throw new AccountException("Accounts not found :c");
//        }
//            return accountRepository.findByClientId(client_id);
//        }


}
