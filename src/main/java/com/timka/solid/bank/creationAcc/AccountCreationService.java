package com.timka.solid.bank.creationAcc;

import com.timka.solid.bank.accounts.AccountType;

//@Component
public interface AccountCreationService {
    void create(AccountType accountType, long bankID, String clientID, long accountID);
}
