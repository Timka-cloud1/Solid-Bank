package com.timka.solid.bank;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountType;

import java.util.Scanner;

//@Component
public class MyCLI implements CLIUI {
    private Scanner scanner;


  //  @Autowired
    public MyCLI() {
        this.scanner = new Scanner(System.in);
    }


    public double requestClientAmount() {
        throw new UnsupportedOperationException();
    }

    public String requestClientAccountNumber() {

        throw new UnsupportedOperationException();
    }
    public AccountType requestAccountType() {
        String type = scanner.nextLine();
        if(!AccountType.CHECKING.toString().equals(type) && !AccountType.SAVING.toString().equals(type) && !AccountType.FIXED.toString().equals(type)) {
            System.out.println("Bank account NOT created");
            return null;
        }
        return AccountType.valueOf(type);


    }


}
