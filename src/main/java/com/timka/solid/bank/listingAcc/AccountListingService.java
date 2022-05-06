package com.timka.solid.bank.listingAcc;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountType;
import com.timka.solid.bank.accounts.AccountWithdraw;

import java.util.List;
//@Component
public interface AccountListingService {
    Account getClientAccount(String clientID, String accountID);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    List<Account> getClientAccounts(String clientID);
    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
