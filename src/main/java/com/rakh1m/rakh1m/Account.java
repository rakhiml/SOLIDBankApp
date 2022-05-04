package com.rakh1m.rakh1m;

public class Account {
    private AccountType accountType;
    private String id;
    private String clientID;
    private double balance;
    private boolean withDrawAllowed;

    public double getBalance() {
        return this.balance;
    }
    public String toString() {

        return "id=" + this.id + ", clientID=" + this.clientID + ", balance=" + this.balance;
    }

    public String getClientID(){
        return clientID;
    }
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
    public Account(AccountType accountType, String id, String clientID, double balance, boolean withDrawAllowed) {
        this.accountType = accountType;
        this.id = id;
        this.clientID = clientID;
        this.balance = balance;
        this.withDrawAllowed = withDrawAllowed;
    }

    public void setWithDrawAllowed(boolean withDrawAllowed){
        this.withDrawAllowed = withDrawAllowed;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }



}
