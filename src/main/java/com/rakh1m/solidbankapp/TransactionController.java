package com.rakh1m.solidbankapp;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api_v1/accounts")
@AllArgsConstructor
public class TransactionController {

    private TransactionService transactionService;

    @GetMapping("{account_id}/transactions")
    public List<Transaction> getTransactions(@PathVariable String account_id) {
        return transactionService.getTransactions(account_id);
    }

    @PostMapping("{account_id}/withdraw")
    public String withdrawFrom(@PathVariable String account_id, @RequestBody TransferRequest transferRequeset) {
        return transactionService.withdraw(account_id,transferRequeset);

    }
    @PostMapping("{account_id}/deposit")
    public String depositTo(@PathVariable String account_id, @RequestBody TransferRequest transferRequeset) {
        return transactionService.deposit(account_id,transferRequeset);
    }
}
