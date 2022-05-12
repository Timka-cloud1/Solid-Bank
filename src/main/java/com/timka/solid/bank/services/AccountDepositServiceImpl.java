package com.timka.solid.bank.services;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDepositServiceImpl implements AccountDepositService{
    private AccountDAO accountDAO;

    @Autowired
    public AccountDepositServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


    @Override
    public void deposit(double amount, Account account) {
        accountDAO.updateAccount(account, amount);
    }
}
