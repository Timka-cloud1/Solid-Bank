package com.timka.solid.bank;

import com.timka.solid.bank.accounts.AccountType;
import com.timka.solid.bank.services.AccountCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankCore {
    private static long id = 1;
    private long lastAccountNumber = 1;
    private final AccountCreationService accountCreationService;

    @Autowired
    public BankCore(AccountCreationService accountCreationService) {
        this.accountCreationService = accountCreationService;
    }

    //создает аккаунт
    public void createNewAccount(AccountType accountType, String clientID) {

        accountCreationService.create(accountType, id, clientID);
        //incrementLastAccountNumber();
    }

    private void incrementLastAccountNumber() {
        lastAccountNumber++;
    }

}
