package com.rakh1m.solidbankapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SolidBankApp implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(SolidBankApp.class);
    }

    @Override
    public void run(String... args) throws Exception {
        boolean running = true;
        String clientID = "1";

        MyCLI myCLI = context.getBean(MyCLI.class);
        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
        TransactionDepositCLI transactionDepositCLI = context.getBean(TransactionDepositCLI.class);
        TransactionWithdrawCLI transactionWithdrawCLI = context.getBean(TransactionWithdrawCLI.class);

        //Greeting text
        String helpMessage = "1 - show accounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";
        System.out.println("Welcome to CLI bank service\n");
        System.out.println("Enter operation number: \n");
        System.out.println(helpMessage);

        //Starting CLI for user input
        while (running) {
            switch (myCLI.getScanner().nextLine()) {

                //Get account list
                case "1" -> accountBasicCLI.getAccounts(clientID);

                //Create account request
                case "2" -> {
                    System.out.println("Please enter account type \n[CHECKING, SAVING, FIXED]");
                    accountBasicCLI.createAccountRequest(clientID);
                }

                //Deposit to account from NA
                case "3" -> transactionDepositCLI.depositMoney(clientID);

                //Withdraw from account (not FIXED account)
                case "4" -> transactionWithdrawCLI.withdrawMoney(clientID);

                //Help list
                case "6" -> System.out.printf(helpMessage);

                //Exit
                case "7" -> {
                    System.out.println("Application Closed\n");
                    running = false;
                }
                default -> System.out.println("Command not recognized!\n");
            }

        }
        myCLI.getScanner().close();
        System.exit(0);
    }
}
