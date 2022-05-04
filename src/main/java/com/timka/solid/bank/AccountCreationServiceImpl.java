package com.timka.solid.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;

    //@Autowired
    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        Account account = new Account(accountType, accountID, clientID, 0.0, true);
        accountDAO.createNewAccount(account);
    }
}
