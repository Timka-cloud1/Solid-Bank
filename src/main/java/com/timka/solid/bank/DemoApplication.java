package com.timka.solid.bank;

import com.timka.solid.bank.cli.AccountBasicCLI;
import com.timka.solid.bank.cli.MyCLI;
import com.timka.solid.bank.cli.TransactionDepositCLI;
import com.timka.solid.bank.cli.TransactionWithdrawCLI;

import com.timka.solid.bank.dao.TransactionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }

    @Override
    public void run(String... arg0) {
        boolean running = true;
        String clientID = "1";

        MyCLI myCLI = context.getBean(MyCLI.class);
        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
        TransactionDepositCLI transactionDepositCLI = context.getBean(TransactionDepositCLI.class);
        TransactionWithdrawCLI transactionWithdrawCLI = context.getBean(TransactionWithdrawCLI.class);
        TransactionDAO transactionDAO = context.getBean(TransactionDAO.class);
        String helpMessage = "1 - show accounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";
        System.out.println("Welcome to CLI bank service");
        System.out.println("Enter operation number: ");
        System.out.print(helpMessage);
        while (running) {
            String cmd = myCLI.getScanner().nextLine();
            switch (cmd) {

                case "1":
                    accountBasicCLI.getAccounts(clientID);
                    break;
                case "2":
                    System.out.println("Choose account type\n" +
                            "[CHECKING, SAVING, FIXED]");
                    accountBasicCLI.createAccountRequest(clientID);
                    break;
                case "3":
                    transactionDepositCLI.depositMoney(clientID);
                    break;

                case "4":
                    transactionWithdrawCLI.withdrawMoney(clientID);
                    break;
                case "5":
                    System.out.println(transactionDAO.findAll());
                    break;
                case "6":
                    System.out.printf(helpMessage);
                    break;

                case "7":
                    System.out.println("Application Closed");
                    running = false;
                    break;

                default:
                    System.out.println("Command not recognized!");
                    break;
            }
        }
        myCLI.getScanner().close();
        System.exit(0);
    }
}