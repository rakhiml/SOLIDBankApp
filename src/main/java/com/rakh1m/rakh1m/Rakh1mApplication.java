package com.rakh1m.rakh1m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Rakh1mApplication  {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Wellcome to CLI bank service \n Please enter the operation number: \n" +
				"1 - Show Actions \n" +
				"2 - create Account\n" +
				"3 - deposit \n" +
				"4 - withdraw \n" +
				"5 - transfer \n" +
				"6 - this message \n" +
				"7 - exit");
		if (scanner.nextLine().equals("1")) {
			System.out.println("LOL");
		}
		if (scanner.nextLine().equals("2")) {
			MyCLI cli = new MyCLI(scanner);


		}
		else {
			System.out.println(scanner.nextLine());
		}


	}

}
