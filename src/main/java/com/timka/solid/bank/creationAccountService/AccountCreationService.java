package com.timka.solid.bank.creationAccountService;

import com.timka.solid.bank.accounts.AccountType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface AccountCreationService {
    void create(AccountType accountType, long bankID, String clientID, long accountID);
}
