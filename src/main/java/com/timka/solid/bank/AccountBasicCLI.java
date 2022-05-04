package com.timka.solid.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class AccountBasicCLI {
    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;

    private AccountListingService accountListing;

//    @Autowired
    public AccountBasicCLI(@Qualifier(value = "myCLI") CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListing) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }

    public void createAccountRequest(String clientID) {
        AccountType accountType = createAccountOperationUI.requestAccountType();
        bankCore.createNewAccount(accountType, clientID);
    }
    public void getAccounts(String clientID) {
        List<Account> clientAccounts = accountListing.getClientAccounts(clientID);
        System.out.println(clientAccounts);
    }
}
