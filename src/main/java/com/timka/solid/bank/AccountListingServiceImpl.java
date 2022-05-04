package com.timka.solid.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class AccountListingServiceImpl implements AccountListingService{
    private AccountDAO accountDAO;

    // @Autowired
    public AccountListingServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        throw new UnsupportedOperationException();
    }
}
