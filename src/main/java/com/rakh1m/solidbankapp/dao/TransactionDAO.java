package com.rakh1m.solidbankapp.dao;

import com.rakh1m.solidbankapp.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDAO {
    List<Transaction> getTransactions();

    void addTransaction(Transaction transaction);
}
