package com.timka.solid.bank;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.dao.TransactionDAO;
import com.timka.solid.bank.services.AccountDepositService;
import com.timka.solid.bank.transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    private TransactionDAO transactionDAO;

    @Autowired
    public TransactionDeposit(AccountDepositService accountDepositService, TransactionDAO transactionDAO) {
        this.accountDepositService = accountDepositService;
        this.transactionDAO = transactionDAO;
    }

    public void execute(Account account, double amount) {
        accountDepositService.deposit(amount, account);
        Transaction transaction = new Transaction(new Date().toString(), "refill", account.getAccountID(), amount);
        transactionDAO.addTransaction(transaction);
    }


}
