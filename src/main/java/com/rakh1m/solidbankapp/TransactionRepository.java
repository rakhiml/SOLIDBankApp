package com.rakh1m.solidbankapp;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {


    //List<Transaction> getTransactionByaccount_id (String account_id);

    @Override
    List<Transaction> findAll();

    @Query("SELECT * where account_id = :account_id")
    List<Transaction> getTransactionByAccount_id(String account_id);
}
