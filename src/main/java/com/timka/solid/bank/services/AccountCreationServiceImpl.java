package com.timka.solid.bank.services;

import com.timka.solid.bank.accounts.*;
import com.timka.solid.bank.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;

    @Autowired
    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {

        Account account = null;
        if (accountType.toString().equals("CHECKING")) {
            account = new CheckingAccount(accountType, bankID, accountID, clientID, 0.0, true);
        } else if (accountType.toString().equals("FIXED")) {
            account = new FixedAccount(accountType, bankID, accountID, clientID, 0.0, false);
        } else if (accountType.toString().equals("SAVING")) {
            account = new SavingAccount(accountType, bankID, accountID, clientID, 0.0, true);
        }
        accountDAO.createNewAccount(account);
    }
}
