package com.timka.solid.bank.inmemory;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountType;
import com.timka.solid.bank.accounts.AccountWithdraw;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


public class MemoryAccountDAO implements AccountDAO{
    private List<Account> accountList = new ArrayList<>();

    @PostConstruct
    private void init() {
        accountList = new ArrayList<>();
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
        System.out.println("Bank account created");
    }

    @Override
    public void updateAccount(Account account) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        throw new UnsupportedOperationException();
       // return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        throw new UnsupportedOperationException();
      //  return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        throw new UnsupportedOperationException();
   //     return null;
    }
}
