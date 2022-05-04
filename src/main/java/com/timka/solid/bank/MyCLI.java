package com.timka.solid.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class MyCLI implements CreateAccountOperationUI {
    //private Scanner scanner;
    private String type;

//    @Autowired
//    public MyCLI(Scanner scanner) {
//        this.scanner = scanner;
//    }


    public double requestClientAmount() {
        throw new UnsupportedOperationException();
    }

    public String requestClientAccountNumber() {

        throw new UnsupportedOperationException();
    }
    public AccountType requestAccountType() {
        return new AccountType(type);
    }

    public void setType(String type) {
        this.type = type;
    }

}
