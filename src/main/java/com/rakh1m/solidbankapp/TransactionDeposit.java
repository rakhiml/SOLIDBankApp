package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accountServices.AccountDepositService;
import com.rakh1m.solidbankapp.accounts.Account;
import com.rakh1m.solidbankapp.dao.TransactionDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    private TransactionDAO transactionDAO;
//    @Autowired
//    public void TransactionDeposit(AccountDepositService accountDepositService, TransactionDAO transactionDAO){
//        this.accountDepositService = accountDepositService;
//        this.transactionDAO = transactionDAO;
//    }

    public void execute(Account account, double amount) {
        // transactionDAO.addTransaction(new Transaction(account,amount));
        accountDepositService.deposit(amount, account);

    }
}
