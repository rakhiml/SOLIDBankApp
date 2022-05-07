package com.rakh1m.rakh1m;

public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
//        if (accountType == null) {
//            System.out.println("Account has NOT been created.");
//
//        }
        try {
            accountType.toString();
        } catch (NullPointerException e) {
            throw new WrongAccountType();
        }
        Account acc;
        switch (accountType.toString()) {
            case "FIXED":
                acc = new FixedAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, false);
                break;
            case "SAVING":
                acc = new SavingAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, false);
                break;
            case "CHECKING":
                acc = new CheckingAccount(accountType, String.format("%03d%06d", 1, accountID), clientID, 0, false);
                break;
            default:
                return;
        }

        accountDAO.createNewAccount(acc);

    }
}
