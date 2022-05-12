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
    public void withdraw(double amount, AccountWithdraw account) {
        accountDAO.updateAccount(account, (-1 * amount));
    }
}
