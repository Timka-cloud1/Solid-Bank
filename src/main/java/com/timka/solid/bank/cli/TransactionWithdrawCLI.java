package com.timka.solid.bank.cli;

import com.timka.solid.bank.TransactionWithdraw;
import com.timka.solid.bank.accounts.AccountWithdraw;
import com.timka.solid.bank.services.AccountListingService;
import com.timka.solid.bank.ui.WithdrawDepositOperationCLIUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionWithdrawCLI {
    private TransactionWithdraw transactionWithdraw;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    @Autowired
    public TransactionWithdrawCLI(TransactionWithdraw transactionWithdraw, WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListingService) {
        this.transactionWithdraw = transactionWithdraw;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListing = accountListingService;
    }

    public void withdrawMoney(String clientID) {
        String accountID = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        AccountWithdraw clientAccount = accountListing.getClientWithdrawAccount(clientID, accountID);
        if(clientAccount == null) {
            System.out.println("you cannot withdraw money from a fixed account or account doesn't exist");
            return;
        }
        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        if(amount == 0) {
            return;
        }
        if(amount < 0) {
            System.out.println("Amount should be more than 0");
            return;
        }
        transactionWithdraw.execute(clientAccount, amount);


    }
}
