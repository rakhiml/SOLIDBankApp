package com.rakh1m.solidbankapp;

public class IncorrectAmountException extends RuntimeException{
    public IncorrectAmountException(String errorMsg) {
        System.out.println("Error! " + errorMsg);
    }
}
