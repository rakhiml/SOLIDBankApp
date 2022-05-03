package com.rakh1m.rakh1m;

import java.util.Scanner;

public class MyCLI implements CLIUI{
    Scanner scanner;

    public MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public AccountType requestAccountType() {
        AccountType accountType = new AccountType(scanner.nextLine());
        AccountBasicCLI accountBasicCLI = new AccountBasicCLI()
        return null;
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
