package com.timka.solid.bank;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


//@Configuration
//@ComponentScan("com.timka.solid.bank")
public class SpringProjectApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
		System.out.print("Welcome to CLI bank service\n" +
				"Enter operation number:\n" +
				"1 - show accounts\n" +
				"2 - create account\n" +
				"3 - deposit\n" +
				"4 - withdraw\n" +
				"5 - transfer\n" +
				"6 - this message\n" +
				"7 - exit\n");
		Scanner scanner = new Scanner(System.in);
		AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
		while (true) {
			String answer = scanner.nextLine();
			if (answer.equals("1")) {

				accountBasicCLI.getAccounts("1");
			}
			else if(answer.equals("2")) {
				System.out.println("Choose account type\n" +
						"[CHECKING, SAVING, FIXED]");

				accountBasicCLI.createAccountRequest("1");
			}
			else if(answer.equals("7")) {
				System.out.println("Application closed");
				break;
			} else {
				System.out.println("Operation not found, try again");
			}
		}
		context.close();



	}

}
