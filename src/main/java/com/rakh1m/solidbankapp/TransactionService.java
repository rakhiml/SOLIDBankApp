package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accountServices.AccountDepositService;
import com.rakh1m.solidbankapp.accountServices.AccountListingService;
import com.rakh1m.solidbankapp.accountServices.AccountWithdrawService;
import com.rakh1m.solidbankapp.accounts.*;
import com.rakh1m.solidbankapp.dao.TransactionDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TransactionService {
    private TransactionDAO transactionDAO;
    private AccountListingService accountListingService;
    private AccountWithdrawService accountWithdrawService;
    private AccountDepositService accountDepositService;
    public List<Transaction> getTransactions(String account_id) {
     return transactionDAO.findAllByTransactionID(account_id);
    }

    public String withdraw(String accountID, TransferRequest userRequest) {
        Account account = accountListingService.getClientWithdrawAccount("1", accountID);
        if (account == null) throw new TransactionException("Valid account has not been found");
        if (userRequest.getAmount() > account.getBalance()) throw new TransactionException("Not enough funds");
        account.setBalance(account.getBalance() - userRequest.getAmount());
        accountWithdrawService.withdraw(userRequest.getAmount(), account);
        Transaction transaction = Transaction.builder().transactionType("withdraw").
                amount(userRequest.getAmount()).transactionID(accountID).build();
        Transaction createdTransaction = transactionDAO.save(transaction);
        return createdTransaction.getTransactionID();
    }

    public String deposit(String accountID, TransferRequest userRequest) {
        Account account = accountListingService.getClientAccount("1", accountID);
        if (account == null) throw new TransactionException("Valid account has not been found");
        account.setBalance(account.getBalance() + userRequest.getAmount());
        accountDepositService.deposit(userRequest.getAmount(), account);
        Transaction transaction = Transaction.builder().transactionType("deposit").
                amount(userRequest.getAmount()).transactionID(accountID).build();
        Transaction createdTransaction = transactionDAO.save(transaction);
        return createdTransaction.getTransactionID();
    }


}
