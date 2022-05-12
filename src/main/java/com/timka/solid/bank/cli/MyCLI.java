package com.timka.solid.bank.cli;

import com.timka.solid.bank.accounts.AccountType;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Getter
public class MyCLI implements CLIUI {
    private Scanner scanner;


    @Autowired
    public MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }


    public double requestClientAmount() {
        System.out.println("Type amount of money");
        String amountString = scanner.nextLine();
        if(amountString.startsWith("-0")) {
            System.out.println("Wrong! Invalid arguments");
            amountString = "0";
        }
        double amount = 0.0;

        try {
            amount = Double.parseDouble(amountString);
        } catch (NumberFormatException e) {
            System.out.println("Wrong! Invalid arguments");
        }
        return amount;
    }

    public String requestClientAccountNumber() {
        System.out.println("Type account ID");
        return scanner.nextLine();


    }

    public AccountType requestAccountType() {
        String type = scanner.nextLine();
        if (!AccountType.CHECKING.toString().equals(type) && !AccountType.SAVING.toString().equals(type) && !AccountType.FIXED.toString().equals(type)) {
            System.out.println("Bank account NOT created");
            return null;
        }
        return AccountType.valueOf(type);


    }


}
