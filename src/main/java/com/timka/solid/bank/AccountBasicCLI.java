package com.timka.solid.bank;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountType;
import com.timka.solid.bank.creationAcc.CreateAccountOperationUI;
import com.timka.solid.bank.listingAcc.AccountListingService;
import org.springframework.beans.factory.annotation.Qualifier;

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
        if(accountType == null) {
            return;
        }
        bankCore.createNewAccount(accountType, clientID);
    }
    public void getAccounts(String clientID) {
        List<Account> clientAccounts = accountListing.getClientAccounts(clientID);
        System.out.println(clientAccounts);
    }
}
