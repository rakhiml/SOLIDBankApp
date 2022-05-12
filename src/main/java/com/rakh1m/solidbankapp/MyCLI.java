package com.rakh1m.solidbankapp;

import com.rakh1m.solidbankapp.accounts.AccountType;
import com.rakh1m.solidbankapp.appUI.CLIUI;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Getter
@Component

public class MyCLI implements CLIUI {
    private final Scanner scanner;

    @Autowired
    public MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    public MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }


    @Override
    public AccountType requestAccountType() {
        try {
            return Enum.valueOf(AccountType.class, scanner.nextLine());
        } catch (IllegalArgumentException e) {
            return null;
        }

    }


    @Override

    public double requestClientAmount() {
        System.out.println("Please enter amount to transfer: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
            return amount;
        } catch (NumberFormatException e) {
            System.out.println("Wrong format!");
        }
        return 0.0d;
    }

    @Override

    public String requestClientAccountNumber() {
        System.out.println("Please enter account number: ");
        return scanner.nextLine();

    }
}
