package com.rakh1m.rakh1m;

public class WrongAccountType extends NullPointerException {
    @Override
    public String getMessage() {
        return "Account has NOT been created";
    }
}
