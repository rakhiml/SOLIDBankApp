package com.rakh1m.rakh1m;

import com.rakh1m.rakh1m.accounts.AccountType;
import com.rakh1m.rakh1m.appUI.CLIUI;

import java.util.Scanner;

public class MyCLI implements CLIUI {
    private Scanner scanner;

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
        return 0;
    }

    @Override
    public String requestClientAccountNumber() {
        return null;
    }
}
