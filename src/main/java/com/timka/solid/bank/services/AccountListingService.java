package com.timka.solid.bank.services;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountType;
import com.timka.solid.bank.accounts.AccountWithdraw;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AccountListingService {
    Account getClientAccount(String clientID, String accountID);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    List<Account> getClientAccounts(String clientID);
    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
