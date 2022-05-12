package com.rakh1m.solidbankapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;


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

        String helpMessage = "1 - show accounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";
        System.out.printf("Welcome to CLI bank service\n");
        System.out.printf("Enter operation number: \n");
        System.out.printf(helpMessage);
        while (running) {
            switch (myCLI.getScanner().nextLine()) {

                case "1":
                    accountBasicCLI.getAccounts(clientID);
                    break;

                case "2":
                    System.out.println("Please enter account type \n [CHECKING, SAVING, FIXED]");
                    accountBasicCLI.createAccountRequest(clientID);
                    break;

                case "3":
                    transactionDepositCLI.depositMoney(clientID);
                    break;

                case "4":
                    transactionWithdrawCLI.withdrawMoney(clientID);
                    break;

                case "6":
                    System.out.printf(helpMessage);
                    break;

                case "7":
                    System.out.printf("Application Closed\n");
                    running = false;
                    break;

                default:
                    System.out.printf("Command not recognized!\n");
                    break;
            }
            //myCLI.getScanner().close();
        }
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("props.xml");//AnnotationConfigApplicationContext(AppConfig.class);
//
//        String help = "Wellcome to CLI banking service \n" +
//                "Please enter operation number:\n" +
//                "1 - show accounts;\n" +
//                "2 - create account;\n" +
//                "3 - deposit;\n" +
//                "4 - withdraw;\n" +
//                "5 - transfer;\n" +
//                "6 - this message;\n" +
//                "7 - exit";
//        System.out.println(help);
//        Scanner scn = new Scanner(System.in);
//        //MyCLI mycli = context.getBean(MyCLI.class);
//        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
//        TransactionWithdrawCLI transactionWithdrawCLI = context.getBean(TransactionWithdrawCLI.class);
//        TransactionDepositCLI transactionDepositCLI = context.getBean(TransactionDepositCLI.class);
//        while (true) {
//            String cmd = scn.nextLine();
//            switch (cmd) {
//                case "7" -> {
//                    System.out.println("Application closed.");
//                    System.exit(0);
//                }
//                case "1" -> accountBasicCLI.getAccounts("1");
//                case "2" -> {
//                    System.out.println("Please enter account type \n" +
//                            "[CHECKING, SAVING, FIXED]");
//                    //mycli.requestAccountType();
//                    accountBasicCLI.createAccountRequest("1");
//                }
//                case "3" -> {
//                    System.out.println("Please enter the amount to deposit:");
//                    transactionDepositCLI
//                }
//                case "6" -> System.out.println(help);
//                default -> System.out.println("Command not found!");
//            }
//        }
//       // SpringApplication.run(SolidBankApp.class);
//    }
//    //@Override
//    public void run(String... arg0) throws Exception{
//        boolean running = true;
//        String clientID = "1";
//        MyCLI myCLI = context.getBean(MyCLI.class);
//        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
//
//
//    }
    }
}
