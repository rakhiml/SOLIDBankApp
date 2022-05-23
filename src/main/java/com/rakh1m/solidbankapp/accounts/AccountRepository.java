package com.rakh1m.solidbankapp.accounts;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, String> {


    @Modifying
    @Query("SELECT client_id FROM Account acc where acc.account_type = :accountType and acc.client_id = :clientID")
    List<Account> getByType(String clientID, String accountType);

    @Modifying
    @Query("insert into Account VALUES (:id, :accountType, :clientID,0,:withdrawAllowed)")
    void insert(String accountType, String id, String clientID, Boolean withdrawAllowed);
}
