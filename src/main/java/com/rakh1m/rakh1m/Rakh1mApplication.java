package com.rakh1m.rakh1m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Rakh1mApplication  {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");




	}

}
