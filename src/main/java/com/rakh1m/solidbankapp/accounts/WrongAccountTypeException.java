package com.rakh1m.solidbankapp.accounts;

public class WrongAccountTypeException extends RuntimeException{
    public WrongAccountTypeException(String msg) {
        super(msg);
    }
}
