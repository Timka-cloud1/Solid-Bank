package com.timka.solid.bank.services;

import com.timka.solid.bank.accounts.*;
import com.timka.solid.bank.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountCreationServiceImpl implements AccountCreationService {
    private final AccountDAO accountDAO;

    @Autowired
    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    // создает аккаунт нужного типа
    @Transactional
    @Override
    public void create(AccountType accountType, long bankID, String clientID) {

        Account account = null;
        if (accountType.toString().equals("CHECKING")) {
            account = new CheckingAccount("CHECKING", bankID, clientID, 0.0, true);
        } else if (accountType.toString().equals("FIXED")) {
            account = new FixedAccount("FIXED", bankID, clientID, 0.0, false);
        } else if (accountType.toString().equals("SAVING")) {
            account = new SavingAccount("SAVING", bankID, clientID, 0.0, true);
        }

        if (account == null) {
            System.out.println("ERROR: Wrong type of account");
            return;
        }

        accountDAO.createNewAccount(account.getAccountType(), account.getBankID(), account.getClientID(), account.getBalance(), account.isWithdrawAllowed());
        Long accountID = accountDAO.getLastId();
        accountDAO.setAccountFullId(String.format("%03d%06d", account.getBankID(), accountID), accountID, account.getClientID());
        System.out.println("Bank account created");

    }
}
