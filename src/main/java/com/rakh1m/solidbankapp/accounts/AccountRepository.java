package com.rakh1m.solidbankapp.accounts;

import com.rakh1m.solidbankapp.Transaction;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, String> {
    //@Query("SELECT client_id FROM Account acc where acc.account_type = :accountType and acc.client_id = :clientID")
    // List<Account> findAccountsByClientIDAndAccountType(String clientID, String accountType);
    @Query("SELECT * where client_id = :client_id")
    List<Account> findByClientId(String client_id);

    @Override
    List<Account> findAll();


    Account getAccountByClientID(String client_id);

    void deleteAccountById(String id);



    void deleteById(String id);

    Account getAccountById(String id);

    boolean findAccountById(String id);

    Account getAccountByClientIDAndId(String account_id, String client_id);

    List<Account> getAccountsByClientID(String client_id);



    Account getAccountByIdAndClientIDAndWithdrawAllowedIsTrue(String id, String client_id);

    @Query("SELECT account_type, id, client_id, withdraw_allowed where client_id = :client_id " +
            "and withdraw_allowed = false " +
            "and id = :account_id")
    Account findClientWithdrawAccount(String client_id, String account_id);
//    @Modifying
//    @Query("insert into Account VALUES (:id, :accountType, :clientID,0,:withdrawAllowed)")
//    void insert(String accountType, String id, String clientID, Boolean withdrawAllowed);


}
