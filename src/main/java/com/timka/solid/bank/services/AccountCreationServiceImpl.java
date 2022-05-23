package com.timka.solid.bank.services;

import com.timka.solid.bank.accounts.*;
import com.timka.solid.bank.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountCreationServiceImpl implements AccountCreationService {
    private final AccountDAO accountDAO;

    @Autowired
    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    // создает аккаунт нужного типа
    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {

        Account account = null;
        if (accountType.toString().equals("CHECKING")) {
            account = new CheckingAccount(String.format("%03d%06d", bankID, accountID),"CHECKING", bankID,  clientID ,0.0, true);
        } else if (accountType.toString().equals("FIXED")) {
            account = new FixedAccount(String.format("%03d%06d", bankID, accountID),"FIXED", bankID, clientID, 0.0, false);
        } else if (accountType.toString().equals("SAVING")) {
            account = new SavingAccount(String.format("%03d%06d", bankID, accountID),"SAVING", bankID, clientID, 0.0, true);
        }

        if (account == null) {
            System.out.println("ERROR: Wrong type of account");
           return;
        }

        accountDAO.createNewAccount(account.getAccountFullId(), account.getAccountType(), account.getBankID(), account.getClientID(), account.getBalance(), account.isWithdrawAllowed());
        System.out.println("Bank account created");

    }
}
