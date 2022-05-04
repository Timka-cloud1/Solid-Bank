package com.timka.solid.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class MyCLI implements CLIUI {
    private Scanner scanner;


  //  @Autowired
    public MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }


    public double requestClientAmount() {
        throw new UnsupportedOperationException();
    }

    public String requestClientAccountNumber() {

        throw new UnsupportedOperationException();
    }
    public AccountType requestAccountType() {
        String type = scanner.nextLine();
        return new AccountType(type);
    }


}
