package com.rakh1m.rakh1m;

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
        System.out.println();
        AccountType at = new AccountType(this.scanner.nextLine());

        return at;
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
