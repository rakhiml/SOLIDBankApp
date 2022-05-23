package com.rakh1m.solidbankapp;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, String> {

    @Modifying
    @Query("insert into Transaction VALUES (:id, :accountType, :clientID,0,:withdrawAllowed)")
    void insert(long ID, Double amount, String transactionType);
}
