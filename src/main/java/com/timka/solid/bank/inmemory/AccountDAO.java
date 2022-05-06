package com.timka.solid.bank.inmemory;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountType;
import com.timka.solid.bank.accounts.AccountWithdraw;

import java.util.List;


public interface AccountDAO {
    List<Account> getClientAccounts(String clientID);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    Account getClientAccount(String clientID, String accountID);
}
