package com.rakh1m.solidbankapp.dao;

import com.rakh1m.solidbankapp.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryTransactionDAO implements TransactionDAO {
    // @Override
    public List<Transaction> transactions = new ArrayList<>();

    @Override
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
