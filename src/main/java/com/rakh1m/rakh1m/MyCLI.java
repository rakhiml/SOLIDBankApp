package com.rakh1m.rakh1m;

import java.util.Scanner;

public class MyCLI implements CLIUI{
    //Scanner scanner;
    private String str;
//    public MyCLI(Scanner scanner) {
//        this.str = scanner;
//    }


    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public AccountType requestAccountType() {
        //System.out.println("Please enter your account type");
        AccountType at = new AccountType(this.str);
        return at;
    }

    @Override
    public double requestClientAmount()  {
        return 0;
    }

    @Override
    public String requestClientAccountNumber() {
        return null;
    }
}
