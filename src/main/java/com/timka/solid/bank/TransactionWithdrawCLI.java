package com.timka.solid.bank;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountWithdraw;
import com.timka.solid.bank.listingAccountService.AccountListingService;
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
            return;
        }
        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        if(amount <= 0) {
            System.out.println("Amount should be more than 0");
            return;
        }
        if(clientAccount.getBalance() < amount) {
            System.out.println("there are not enough funds in your account");
            return;
        }
        transactionWithdraw.execute(clientAccount, amount);
        System.out.printf("%.2f$ transferred from %s account\n", amount, accountID);

    }
}
