package com.rakh1m.solidbankapp.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api_v1/accounts")
@AllArgsConstructor
public class AccountController {

    private AccountService accountService;

    @GetMapping("/{client_id}")
    public List<Account> getAccounts(@PathVariable String client_id) {
       return accountService.getAccounts(client_id);
    }

    @GetMapping("/{client_id}/{account_id}")
    public Account getAccount(@PathVariable String client_id, @PathVariable String account_id) {
       return accountService.getAccount(client_id, account_id);
    }

//    @GetMapping("/{account_id}/transactions")
//    void getAccountTransactions(@PathVariable String account_id) {
//
//    }
//
//    @DeleteMapping("{account_id}")
//    public boolean deleteAccount(@PathVariable String account_id)  {
//
//    }
    @PostMapping
    public String createAccount(@RequestBody CreateAccountRequest createAccountRequest) {
        return accountService.createAccount(createAccountRequest);
    }

    @DeleteMapping("{id}")
    public boolean deleteAccount(@PathVariable String id) {
        accountService.deleteAccount(id);
        return true;
    }

//    @PostMapping("{account_id}/withdraw")
//    void withdrawFromAccount(@PathVariable String account_id){
//
//    }
//    @PostMapping("{account_id}/deposit")
//    void depositToAccount(@PathVariable String account_id){
//
//    }


}
