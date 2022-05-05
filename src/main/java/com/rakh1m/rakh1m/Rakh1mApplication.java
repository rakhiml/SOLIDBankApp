package com.rakh1m.rakh1m;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


//@Configuration
public class Rakh1mApplication  {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		String help = "Wellcome to CLI banking service \n" +
				"Please enter operation number:\n" +
				"1 - show accounts;\n" +
				"2 - create account;\n" +
				"3 - deposit;\n" +
				"4 - withdraw;\n" +
				"5 - transfer;\n" +
				"6 - this message;\n" +
				"7 - exit";
		System.out.println(help);
		Scanner scn = new Scanner(System.in);
		MyCLI mycli = context.getBean(MyCLI.class);
		AccountBasicCLI abc = context.getBean(AccountBasicCLI.class);
		while (true) {

			String cmd = scn.nextLine();

			if (cmd.equals("7")){
				System.out.println("Application closed.");
				System.exit(0);

			}
			else if (cmd.equals("1")) {
				abc.getAccounts("1");
			}
			else if(cmd.equals("2")) {
				System.out.print("Please enter account type \n" +
						"[CHECKING, SAVING, FIXED]");
				//mycli.requestAccountType();
				abc.createAccountRequest("1");
			}
			else if (cmd.equals("6")) {
				System.out.println(help);
			}
			else {
				System.out.println("Command not found!");
			}

		}



	}

}
