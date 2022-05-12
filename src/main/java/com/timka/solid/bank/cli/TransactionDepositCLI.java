package com.timka.solid.bank.cli;

import com.timka.solid.bank.TransactionDeposit;
import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.services.AccountListingService;
import com.timka.solid.bank.ui.WithdrawDepositOperationCLIUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionDepositCLI {
    private TransactionDeposit transactionDeposit;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListingService;

    @Autowired
    public TransactionDepositCLI(TransactionDeposit transactionDeposit, WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListingService) {
        this.transactionDeposit = transactionDeposit;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListingService = accountListingService;
    }

    public void depositMoney(String clientID) {
        String accountID = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        if(accountID.length() < 9) {
            System.out.println("account format is invalid");
            return;
        }
        Account clientAccount = accountListingService.getClientAccount(clientID, accountID);
        if(clientAccount == null) {
            System.out.println("account number not found!");
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
        transactionDeposit.execute(clientAccount, amount);
        System.out.printf("%.2f$ transferred to %s account\n", amount, accountID);

    }
}
