package com.rakh1m.rakh1m;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


//@Configuration
public class Rakh1mApplication  {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");

		String help = "Wellcome to CLI banking service" +
				"Please enter operation number:" +
				"1 - show accounts;" +
				"2 - create account;" +
				"3 - deposit;" +
				"4 - withdraw;" +
				"5 - transfer;" +
				"6 - this message;" +
				"7 - exit";
		System.out.println(help);
		Scanner scn = new Scanner(System.in);
		MyCLI mycli = context.getBean(MyCLI.class);
		AccountBasicCLI abc = context.getBean(AccountBasicCLI.class);
		while (true) {
			String cmd = scn.nextLine();

			if (cmd.equals("7")){
				System.exit(0);

			}
			if (cmd.equals("1")) {
				abc.getAccounts("1");
			}
			if(cmd.equals("2")) {
				System.out.println("Please enter account type");
				mycli.setStr(scn.nextLine());
				mycli.requestAccountType();
				abc.createAccountRequest("1");
			}

		}



	}

}
