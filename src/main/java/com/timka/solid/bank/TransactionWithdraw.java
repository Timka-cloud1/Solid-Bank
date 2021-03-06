package com.timka.solid.bank;

import com.timka.solid.bank.accounts.AccountWithdraw;
import com.timka.solid.bank.dao.TransactionDAO;
import com.timka.solid.bank.services.AccountWithdrawService;
import com.timka.solid.bank.transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TransactionWithdraw {
    private AccountWithdrawService accountWithdrawService;
    private TransactionDAO transactionDAO;

    @Autowired
    public TransactionWithdraw(AccountWithdrawService accountWithdrawService, TransactionDAO transactionDAO) {
        this.accountWithdrawService = accountWithdrawService;
        this.transactionDAO = transactionDAO;
    }

    // позволяет снимать деньги со счета(кроме Fixed аккаунтов)
    public void execute(AccountWithdraw accountWithdraw, double amount) {
        if(accountWithdrawService.withdraw(amount, accountWithdraw)) { // если снимают больше чем есть на счету то не записывать это в транзакцию
            Transaction transaction = new Transaction(new Date().toString(), "withdrawal", accountWithdraw.getAccountFullId(), amount);
            transactionDAO.addTransaction(transaction.getDate(), transaction.getTypeOfOperation(), transaction.getAccountNumber(), transaction.getAmount());
        }
    }



}
