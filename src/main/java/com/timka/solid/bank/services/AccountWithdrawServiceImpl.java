package com.timka.solid.bank.services;

import com.timka.solid.bank.accounts.AccountWithdraw;
import com.timka.solid.bank.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountWithdrawServiceImpl implements AccountWithdrawService {
    private AccountDAO accountDAO;

    @Autowired
    public AccountWithdrawServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


    @Override
    public boolean withdraw(double amount, AccountWithdraw account) {
        double balance = accountDAO.getBalance(account.getAccountFullId());
        if(amount > balance) {
            System.out.println("there are not enough funds in your account");
            return false;
        }
        balance -= amount;
        accountDAO.updateAccount(account.getAccountFullId(), balance);
        System.out.printf("%.2f$ transferred from %s account\n", amount, account.getAccountFullId());
        return true;
    }
}
